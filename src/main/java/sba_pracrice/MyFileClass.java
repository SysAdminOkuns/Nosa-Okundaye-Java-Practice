package sba_pracrice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyFileClass {

    public static void main(String[] args) {

//        Primary input and output to files, network streams and internal memory buffer (arrays)
//        Pipes, System.in, System.out, System.err etc.

//        String path = "C:/Users/preci/Documents/TestingFileFolder";
//        File file1 = new File(path);
//        System.out.println("File Name: " + file1.getName());
//        System.out.println("File Path: " + file1.getPath());
//        System.out.println("Is path absolute: " + file1.isAbsolute());
//        System.out.println("Return Absolute path of the File " + file1.getAbsolutePath());
//        System.out.println("Return Parent folder of the given File " + file1.getParent());
//        System.out.println("File is Exist " + file1.exists());
//        System.out.println(file1.exists() ? "Yes file exists" : "file does not exist");
//
//        if(file1.exists())  // return true or False
//        {
//            System.out.println("File is Found");
//            System.out.println("IS file Readable " +  file1.canRead());
//            System.out.println("IS file Writeable " +  file1.canWrite());
//            System.out.println("File size in a bytes " + file1.length()); // file size in byte
//        }

        File f = null;
//
//        try {
//            f = new File("C:\\Users\\preci\\Documents\\TestingFileFolder\\Datafile.txt");
//            if (f.createNewFile()) {
//                System.out.println("New File created!");
//            } else {
//                System.out.println("The file already exists.");
//            }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }

        String path1 = "C:\\Users\\preci\\Documents\\TestingFileFolder\\folder";
        File f2 = new File(path1);
//        f2.mkdir();
        Scanner scanner = null;
        List<String[]> myLinesList = new ArrayList<>();

        try {
            f = new File("C:\\Users\\preci\\Documents\\TestingFileFolder\\Datafile.txt");
            scanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(scanner.next().charAt(0));
//      String line = scanner.nextLine();
//        System.out.println(line);
        scanner.useDelimiter("  ");
        while (scanner.hasNext()){
            String[] myLines = scanner.next().split(" ");
            myLinesList.add(myLines);
        }



//        System.out.println(scanner.delimiter());
//        for(String[] line: myLinesList){
//            System.out.println(Arrays.toString(line) + "\n");
//        }

        scanner.close();


//        System.out.println(file1.getAbsolutePath());
//        System.out.println(file1.length());
//        System.out.println(file1.getFreeSpace());
//        File parentFile = file1.getParentFile();
//        File[] files = parentFile.listFiles();
//
//        for (File myfile : files) {
//            System.out.println(myfile);
//        }

        String path3 = "C:/Users/preci/Documents/TestingFileFolder";
        File demoFile = new File((path3 + "/folder/demo.txt"));
        try {
            if(demoFile.createNewFile()){
                System.out.println("File has been created");
            }else {
                System.out.println("File not created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

// To delete the demo.txt file immediately
//        demoFile.delete();

// To delete the demo.txt file when the JVM terminates
//        demoFile.deleteOnExit();



    }
}
