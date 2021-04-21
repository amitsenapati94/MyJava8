package main.java.com.multithread;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class ConcurrentStringParser {

	public static void main(String[] args) {
		
		ConcurrentStringParser parser = new ConcurrentStringParser();
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
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		//no of threads = no of cores/1-blocking coefficient
		//4/1-0=4
		// for threadpool=2 => 0.007609612
		// for threadpool=4 => 0.004683286
		System.out.println("No of threads can be: " + 4);
		
		final long start = System.nanoTime();
		
		int count = parser.countStringMatch(myList,4,2);
		
		final long end = System.nanoTime();
		
		System.out.println("Time (seconds) taken is " + (end - start)/1.0e9);
		
		System.out.println("count: "+count);
		
	}
	
	public int countStringMatch(final List<String> list, int poolSize, int noOfParts) {
		
		List<String> finalList = new ArrayList<>();
		
		try {
		List<Callable<List<String>>> partitions = new ArrayList<Callable<List<String>>>();
		final int chunksPerPartition = list.size() / noOfParts;
		
		for(int i = 0; i < noOfParts; i++) {
			final int lower = (i * chunksPerPartition) ;
	        final int upper = 
	          (i == noOfParts - 1) ? list.size()-1
	            : lower + chunksPerPartition - 1;
			
			partitions.add(new Callable<List<String>>() {

		          public List<String> call() {
		            return count(new ArrayList<String>(list.subList(lower, upper)));
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
		    } catch(Exception ex) { throw new RuntimeException(ex); }
		
		return finalList.size();
		
		
	}
	
	public List<String> count(final List<String> list)
	{
		List<String> aList = new ArrayList<String>();
		
		for (String s : list) 
		{
			if (s.startsWith("a"))
			{
				aList.add(s);
			}
		}
		
		return aList;
		
	}

}
