package org.example.assignments;
import java.util.Scanner;

public class MyArrayBuilder {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many favorite things do you have? ");
        int count = scanner.nextInt();
        String[] myThings = new String[count];
        int i = 0;

        while (i < count){
            System.out.print("Enter thing: ");
            myThings[i]= scanner.next();
            i++;
        }
        System.out.println("Your favorite things are:");
        for(String item: myThings){
            System.out.print(item + " ");
        }


    }

}
