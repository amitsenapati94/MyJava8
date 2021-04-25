package com.multithread;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.*;

/*
split the List in to multiple sublists using Gauava library
spawn thread for each sublist
 */

public class ConcurrentListParsing {

    public static void main(String args[])
    {
        List<String> myList = new ArrayList<String>();

        myList.add("amit");
        myList.add("sumit");
        myList.add("john");
        myList.add("bob");

        myList.add("amit2");
        myList.add("sumit2");
        myList.add("john2");
        myList.add("bob2");

        myList.add("amit3");
        myList.add("sumit3");
        myList.add("john3");
        myList.add("bob3");

        myList.add("amit4");
        myList.add("sumit4");
        myList.add("john4");
        myList.add("bob4");

        myList.add("John");
        myList.add("John2");


        ConcurrentListParsing concurrentListParsing = new ConcurrentListParsing();

        final long start = System.nanoTime();
        int count = concurrentListParsing.parseListConcurrently(myList,4,5);

        final long end = System.nanoTime();

        System.out.println("Time (seconds) taken is " + (end - start)/1.0e9);

        System.out.println("count: "+count);



    }


    public int parseListConcurrently(List<String> list, int poolSize, int noOfParts)  {
        List<String> finalList = new ArrayList<>();

        List<Callable<List<String>>> partitions = new ArrayList<Callable<List<String>>>();

        List<List<String>> splitLists = splitList(list,noOfParts);

        try{
        for(List<String> eachlist : splitLists) {
            partitions.add(new Callable<List<String>>() {
                @Override
                public List<String> call() throws Exception {
                    return count(eachlist);
                }
            });

        }

        final ExecutorService executorPool =
                Executors.newFixedThreadPool(poolSize);
        final List<Future<List<String>>> resultFromParts =
                executorPool.invokeAll(partitions, 10000, TimeUnit.SECONDS);
        executorPool.shutdown();
        for(final Future<List<String>> result : resultFromParts)
            finalList.addAll(result.get());
        } catch(Exception ex)
            {
                throw new RuntimeException(ex);
            }

		return finalList.size();

}

    public List<List<String>> splitList(List<String> list,int noOfParts)
    {
        List<List<String>> listParts =  Lists.partition(list,noOfParts);

        return listParts;

    }

    public List<String> count(final List<String> list)
    {
        List<String> aList = new ArrayList<String>();

        for (String s : list)
        {
            if (s.startsWith("J"))
            {
                aList.add(s);
            }
        }

        return aList;

    }


}

