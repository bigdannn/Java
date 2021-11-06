package Homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Palindrom {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Напишите фразу:");

        String phrase = reader.readLine().toLowerCase();
        phrase = phrase.replaceAll("\\s+","");


        StringBuffer buffer = new StringBuffer(phrase.toLowerCase());
        buffer.reverse();
        System.out.println(buffer);


         if (phrase.equals(buffer.toString())){
             System.out.println("Фраза является палиндромом.");
         } else {
             System.out.println("Фраза не является палиндромом.");
         }

    }

    private static String toLowerCase() {
        return "";
    }

    private static String toString(StringBuffer buffer) {
        return buffer.reverse().toString();
    }
}
