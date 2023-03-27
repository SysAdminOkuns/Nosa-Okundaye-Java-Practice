package org.example.assignments;

import java.util.Arrays;

public class IntegerArrayExample {

    public static void main(String[] args){
//        creates an array of integers with a length of 3
        int[] myIntArray = new int[3];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        System.out.println("The Integer Array output is " + Arrays.toString(myIntArray));

//        a program that returns the middle element in an array
        int[] arr = {13,5,7,68,2};
        System.out.println("The middle element is " + arr[(arr.length - 1) / 2]);

        int[] arrFives = {1,2,3,4,5};
        int firstElement = arrFives[0];
        int lastElement = arrFives[arrFives.length - 1];
        System.out.println("The first element at index 0 is " + firstElement);
        System.out.println("The last element at index -1 is " + lastElement);
        try{
            System.out.println("Output an element at arrFives[arrFives.length] flags Exception "
                    + arrFives[arrFives.length]);
        }catch (Exception e){
            System.out.println("There is an exception of type: ArrayIndexOutOfBoundsException");
        }

        try {
            arrFives[arrFives.length] = 10;
        }catch (Exception e){
            System.out.println("Assignment failed due to ArrayIndexOutOfBoundsException");
        }

//      create an integer array with a length of 5
        int[] myIntFivesArray = new int[5];
        for(int i = 0; i < myIntFivesArray.length; i++){
            myIntFivesArray[i] = i + 1;
        }
        System.out.println("The Integer Array output is " + Arrays.toString(myIntFivesArray));

//        create an integer array of 5 numbers
        myIntFivesArray = new int[5];
        for(int i = 0; i < myIntFivesArray.length; i++){
            myIntFivesArray[i] = (i + 1) * 2;
        }
        System.out.println("The Integer Array output is " + Arrays.toString(myIntFivesArray));

//        create an array of 5 elements. Loop through the
//        array and print the value of each element, except for the middle (index 2)
//        element.

        int[] myArray = {1,2,3,4,5};
        int middleElement = myArray[(myArray.length - 1) / 2];
        for(int i = 0; i < myIntFivesArray.length; i++){
            if(myArray[i] == middleElement ) {
                continue;
            }
            System.out.print(myArray[i] + " ");
        }
    }
}
