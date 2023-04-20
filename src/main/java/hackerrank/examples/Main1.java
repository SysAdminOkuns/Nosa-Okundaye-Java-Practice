package hackerrank.examples;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static String findNumber(List<Integer> arr, int k){
        String res = "";
        for(Integer i : arr){
            if(i == k){
                res = "YES";
                break;
            }else{
                res = "NO";
            }
        }

        return res;
    }

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        String result = findNumber(myList, 1);
        System.out.println(result);

    }
}
