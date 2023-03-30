package org.example.assignments;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args){
        int[] numArray = {3,4,5,-5,0,12};

//        Minimum value
        int searchValue = numArray[0];

        for(int elem: numArray){
            if(elem < searchValue){
                searchValue= elem;
            }
        }

        System.out.println("The minimum value is " + searchValue);
searchValue = 0;
//        Maximum value
        for(int elem: numArray){
            if(elem > searchValue){
                searchValue = elem;
            }
        }
        System.out.println("The maximum value is " + searchValue);

//        Binary search
        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));
        int binSearch = Arrays.binarySearch(numArray, 11);
        System.out.println(binSearch);

//        Arrays.sort(numArray, (a,b) -> Integer.signum(a) - Integer.signum(b));
//        System.out.println(Arrays.toString(numArray));
//        int sum = 0;
//        for(int num: numArray){
//            sum += num;
//        }
//
//        System.out.println("Sum = " + sum);

//        for(int i = 0; i < numArray.length - 1; i++){
//            int index = i;
//            for(int j = i + 1; j < numArray.length; j++){
//                if(numArray[j] < numArray[i]){
//                    index = j;
//                }
//            }
//            int tempValue = numArray[index];
//            numArray[index] = numArray[i];
//            numArray[i] = tempValue;
//        }
//        System.out.println(Arrays.toString(numArray));
//        System.out.println(numArray[0]);
    }
}
