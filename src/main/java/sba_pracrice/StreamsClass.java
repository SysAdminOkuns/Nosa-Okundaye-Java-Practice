package sba_pracrice;

import java.io.*;

public class StreamsClass {

    public static void main(String[] args) {
//        try {
//            FileReader fileReader = new FileReader("sample.txt");
//            int i = 0;
//            while ((i = fileReader.read()) != -1) {
//                System.out.println((char)i);
//            }
//
//            fileReader.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try {
            // Change below path as per your PC
            FileWriter fileWriter = new FileWriter("output.txt", true);
            char[] chars = new char[]{'A', 'B', 'C', 'D', 'E'};
            String content = "I love my country\n";
            fileWriter.write(content);
            fileWriter.write(chars);
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
