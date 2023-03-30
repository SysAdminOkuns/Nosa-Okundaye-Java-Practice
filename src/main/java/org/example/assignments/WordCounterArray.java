package org.example.assignments;

import java.util.Scanner;

public class WordCounterArray {

    public static void main(String[] args) {
//        I love Java.  You love Java. She loves Java.
        /*
        "I" occurs once
        "love" occurs twice
        "Java" occurs 3 times
        "You" occurs once
        "She" occurs once
        "loves" occurs once
         */
        int a=0,b=0,c=0,x=0,y=0,z = 0;
        String word1 = null,word2= null, word3= null,word4= null,word5= null,word6= null;
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
//        System.out.println(sentence);
        String[] myStrArray = sentence.split(" ");
        for (String word : myStrArray) {
//            System.out.println(word);
            if(word.equals("Java.")){
                word3= word.substring(0,word.length() - 1);
                word = word3;
                word3 = null;
            }
            switch (word){
                case "I":
                    word1= word + " occurs " + ++a + " time";
                    break;
                case "love":
                    word2= word + " occurs " + ++b + " times";
                    break;
                case "Java":
                    word3= word + " occurs " + ++c + " times";
                    break;
                case "You":
                    word4= word + " occurs " + ++x + " times";
                    break;
                case "She":
                    word5= word + " occurs " + ++y + " times";
                    break;
                case "loves":
                    word6= word + " occurs " + ++z + " times";
                    break;
                default:
                    break;

            }
        }

        System.out.println(word1.replace("1", "once"));
        System.out.println(word2.replace("2", "twice"));
        System.out.println(word3.replace("3", "thrice"));
        System.out.println(word4.replace("1", "once"));
        System.out.println(word5.replace("1", "once"));
        System.out.println(word6.replace("1", "once"));
    }
}
