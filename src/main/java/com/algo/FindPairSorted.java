package main.java.com.algo;

public class FindPairSorted {

    public static void main(String[] args) {

        FindPairSorted findPairSorted = new FindPairSorted();
        int[] myArray = {1,2,4,5,6,7,9};
        //int[] myArray = {1,2,3,4,9};

        int sum = 8;
        findPairSorted.findMatch(sum,myArray);
    }

    public void findMatch(int sum, int[] myArray){
        //System.out.println(myArray.length);

        int maxIndex =myArray.length-1;
        int counter = 0;
        int min = myArray[0];
        int max = myArray[maxIndex];

        while (min <= max) {

        for (int i=0; i < myArray.length; i++) {

            System.out.println("count:"+ ++counter);
                if (min + max == 8) {
                    System.out.println("match found");
                    System.out.println(min + " " + max);
                    break;
                } else if (min + max < 8){
                    min = myArray[++i];
                }else if (min + max > 8){
                    max= myArray[--maxIndex];
                }
            }
        }


        /*for (int i=0; i < myArray.length; i++){
            boolean matchFound = false;

            int min = myArray[i];
            int max = myArray[length-1];

            while( !matchFound) {

                if (min + max > 8) {
                    max = myArray[--length];
                    //matchFound = checkSum(min, max);
                } else if ( min + max ==8 ){
                    matchFound = true;
                    System.out.println("match found");
                    System.out.println(min + " " + max);
                }

                *//*else if (min + max < 8) {
                    max = myArray[i+1];
                    matchFound = checkSum(min, max);
                }*//*
            }
        }*/

        }

    private boolean checkSum(int min, int max) {
        if (min + max == 8) {
            System.out.println("match found");
            System.out.println(min + " " + max);
            return true;
        }
        return false;
    }

}


