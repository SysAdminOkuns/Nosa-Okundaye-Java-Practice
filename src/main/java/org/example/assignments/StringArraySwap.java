package org.example.assignments;

import java.util.Arrays;

public class StringArraySwap {

    public static  void main(String[] args){
        String[] myStrArray = { "red", "green", "yellow", "blue", "yellow"};
        System.out.println("Before Swap: " + Arrays.toString(myStrArray));
        String tempPosition = "";
        String firstElement = myStrArray[0];
        String middleElement = myStrArray[(myStrArray.length - 1) / 2 ];

//        Swap
        tempPosition = middleElement;
        myStrArray[(myStrArray.length - 1) / 2 ] = firstElement;
        myStrArray[0] = tempPosition;

        System.out.println("After Swap: " + Arrays.toString(myStrArray));
    }
}
