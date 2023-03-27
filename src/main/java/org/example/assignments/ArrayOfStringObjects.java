package org.example.assignments;

import java.util.Arrays;

public class ArrayOfStringObjects {

    public static void main(String[] args){
        String[] myStrArray = {"red", "green", "blue", "yellow"};
        int strArrayLen = myStrArray.length;
        System.out.println(strArrayLen);
        String[] nStrArray = myStrArray.clone();
        System.out.println(Arrays.toString(nStrArray));
    }

}
