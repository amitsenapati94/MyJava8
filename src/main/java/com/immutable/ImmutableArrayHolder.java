package com.immutable;

class ImmutableArrayHolder {

    private final int[] theArray;

    // Right way to write a constructor -- copy the array

    public ImmutableArrayHolder(int[] anArray) {
        this.theArray = (int[]) anArray.clone();
    }

    // Right way to write an accessor -- don't expose the array reference
    public int getArrayLength() { return theArray.length; }

    public int getArray(int n) { return theArray[n]; }

    // Right way to write an accessor -- use clone()
    public int[] getArray(){ return (int[]) theArray.clone(); }

    // Wrong way to write an accessor -- expose the array reference
    // A caller could get the array reference and then change the contents
    public int[] getArray2()       { return theArray; }

}
