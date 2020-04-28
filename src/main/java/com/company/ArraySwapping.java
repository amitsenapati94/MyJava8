package com.company;

/**
 * @author Wells Fargo Advisors
 *
 */
public class ArraySwapping {

 public static char[] colorArray = 
   //{'B', 'R', 'B', 'W', 'R', 'W', 'B', 'R', 'W', 'R', 'B', 'W'};
    {'A', 'B', 'C', 'D'};
 public static int swapCount = 0;
 public static void main(String[] args) {
  //TODO: In one pass of the color array, 
  //order the array in the least number of swaps using
  //the provided swap method so that you have all the R's, 
  //followed by all of the W's, and then all of the B's.  
  //);
  
  for (int i=0; i< colorArray.length; i++) 
  {
      swap(0,i);
	 
	  /*if (colorArray[i] == 'R')
	  {
		  swap(i,i-1);
	  }
	  
	  if (colorArray[i] == 'W')
	  {
		  swap(i,i-1);
	  }
	  if (colorArray[i] == 'B')
	  {
		  swap(i,i-1);
	  }
   */
  }

  System.out.println("The number of swaps is " + swapCount);
  printArray();
 }

 public static void swap(int index1, int index2) {
  char swapChar;
  swapChar = colorArray[index1];
  colorArray[index1] = colorArray[index2];
  colorArray[index2] = swapChar;
  swapCount++;
 }
 
 public static void printArray() {
  for (int i=0; i<colorArray.length; i++) {
   System.out.println(colorArray[i]);
  }  
 }

}