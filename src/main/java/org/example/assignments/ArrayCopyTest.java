package org.example.assignments;

import java.util.Arrays;

public class ArrayCopyTest {

    public static void main(String[] args){

        int[] sourceArray= {1,2,3,4,5,1,2};

        int len = sourceArray.length;
        int[] targetArray= new int[len];
        int[] clonedArray = new int[len];
        System.out.println("Before: ");
        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(targetArray));

        System.arraycopy(sourceArray, 0, targetArray, 1, 3);

        System.out.println("After: ");
        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(targetArray));

        System.out.println("After cloning an array: ");
        clonedArray = sourceArray.clone();
        System.out.println(Arrays.toString(clonedArray));
    }
}
