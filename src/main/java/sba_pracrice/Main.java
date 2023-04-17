package sba_pracrice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("sample.txt");
        System.out.println("----------- Testing reading sample.txt -----");
        // “item name”, “item description”, “price”, “available quantity”
        System.out.printf("%-20s%-20s%-10s%-10s\n", "Item Name", "Item Description", "Price", "Available Description");
        int i = 0;
        String myVar = null;
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                ++i;
                myVar = "myString" + String.valueOf(i);
                myVar = scanner.nextLine();
                String[] myLine = myVar.split("  ");
                for(int j= 0; j < myLine.length; j++){
                    switch (j){
                        case 0:
                        case 1:
                            System.out.printf("%-20s", myLine[j]);
                            break;
                        case 2:
                            double price = Double.parseDouble(myLine[j]);
                            System.out.printf("%-10.2f", price);
                            break;
                        case 3:
                            System.out.printf("%-10s", myLine[j]);
                            break;
                    }
                }
                System.out.println("\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
