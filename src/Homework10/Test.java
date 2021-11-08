package Homework10;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int number = (int) (Math.random()*3);


        System.out.println(random());
    }

    public static String letters(){
        String [] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "x", "y", "z"};
        return letters[(int) (Math.random() * 23)];
    }
    public static String upperLetters(){
        String [] upperLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "V", "X", "Y", "Z"};
        return upperLetters[(int) (Math.random() * 23)];
    }
    public static String numbers(){
        String [] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        return numbers[(int) (Math.random() * 10)];
    }
    public static String slash(){
        String slash = "_";
        return slash;
    }
    public static String random(){
        String [] cases = new String[8];
        boolean useNumbers = false;
        boolean useLetters = false;
        boolean useUpper = false;
        boolean useSlash= false;

        String h = null;

        for (int i = 0; i < cases.length; i++) {

            int random = (int) (Math.random()*4+1);

            switch(random){
                case 1: cases[i] = numbers(); useNumbers = true;
                    break;
                case 2:  cases[i] = letters(); useLetters = true;
                    break;
                case 3: cases[i] = upperLetters(); useUpper = true;
                    break;
                case 4: cases[i] = slash(); useSlash = true;
                break;
            }
        }

        StringBuilder builder = new StringBuilder();
        for(String s : cases) {
            builder.append(s);
        }
        String str = builder.toString();

        if (useLetters && useNumbers && useUpper && useSlash){
            return str;
        } else {
            return random();
        }
    }
    }

