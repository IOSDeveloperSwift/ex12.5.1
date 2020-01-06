package com.Doloscan;

public class Main {

    public static void main(String[] args) {

        String str = "uuuhhhjjjoooppp";
        System.out.println("The String is => " + str);
        System.out.println("The number of triples in the string is => " + noOfTriples(str));


    }

    public static int noOfTriples(String str){

        int len = str.length();
        int count = 0;

        for (int i = 0; i < len-2; i++){
            char tmp = str.charAt(i);
            if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
                count++;
        }
        return count;
    }


}
