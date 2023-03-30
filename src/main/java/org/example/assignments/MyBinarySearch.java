package org.example.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MyBinarySearch {

    public static int bSearch(int[] arr, int searchNum) {
        int startIndex = 0, endIndex = arr.length - 1;
        int result = -1;
        while (startIndex <= endIndex) {
            int midPosition = startIndex + (endIndex - startIndex) / 2;

            if (arr[midPosition] == searchNum) { // search value found at the middle midPosition
                result = midPosition;
                break;
            } else if (arr[midPosition] < searchNum) { // middle element less than the search term so ignore left-hand-side
                startIndex = midPosition + 1;
            } else { // middle element greater than the search term so ignore right-hand-side
                endIndex = midPosition - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] myNumArr = {28, 85, 23, 56, 2, 45, 67, 11, 3, 30};
        Scanner scanner = new Scanner(System.in);
        Arrays.sort(myNumArr);
        System.out.println("Here is our sorted array " + Arrays.toString(myNumArr));
        System.out.println("Length of sorted array: " + myNumArr.length);

        System.out.print("Enter search value: ");
        int value = scanner.nextInt();

        int result = MyBinarySearch.bSearch(myNumArr, value);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found in index " + result + " and the value is " + myNumArr[result]);
        }
    }
}
