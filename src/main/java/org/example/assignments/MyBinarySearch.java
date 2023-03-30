package org.example.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MyBinarySearch {

    public static int bSearch(int[] arr, int searchNum){
        int lhs = 0, rhs = arr.length - 1;

        while(lhs <= rhs){
            int middle = lhs + (rhs - lhs) / 2;

            if(arr[middle] == searchNum){ // search value found at the middle position
                return middle;
            }

            if(arr[middle] < searchNum){ // middle element less than the search term so ignore left-hand-side
                lhs = middle + 1;
            }else{ // middle element greater than the search term so ignore right-hand-side
              rhs = middle - 1;
            }
        }

        return  -1;
    }

    public static void main(String[] args){
        int[] myNumArr = {28,85,23,56,2,23,45,67,11,3,30};
        Scanner scanner = new Scanner(System.in);
        Arrays.sort(myNumArr);
        System.out.println("Here is our sorted array " + Arrays.toString(myNumArr));

        System.out.print("Enter search value: ");
        int value = scanner.nextInt();

        int result = MyBinarySearch.bSearch(myNumArr,value);

        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found in index " + result + " and the value is " + myNumArr[result]);
        }
    }
}
