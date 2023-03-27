package org.example.assignments;

import java.util.Arrays;

public class ArraySortAscendingOrder {

    public static  void main(String[] args){
        int[] myIntArr = {4,2,9,13,1,0};
        System.out.println("Before Ascending Sort: " + Arrays.toString(myIntArr));
        for(int i = 0; i < myIntArr.length - 1; i++){
            int index = i;
            for(int j = i + 1; j < myIntArr.length; j++){
                if(myIntArr[j] < myIntArr[i]){
                    index = j;
                }
            }
            int tempValue = myIntArr[index];
            myIntArr[index] = myIntArr[i];
            myIntArr[i] = tempValue;
        }

        System.out.println("After Ascending Sort: " + Arrays.toString(myIntArr));
        System.out.println("The smallest number of sorted array "
        + myIntArr[0]);
        System.out.println("The biggest number of sorted array "
                + myIntArr[myIntArr.length - 1]);
    }
}
