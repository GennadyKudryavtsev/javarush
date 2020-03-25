package com.javarush.task.task06.task0610;

/* 
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String q = bufferedReader.readLine();
        return q;
    }

    public static int readInt() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String w = bufferedReader.readLine();
        int a = Integer.parseInt(w);
        return a;
    }

    public static double readDouble() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String r = bufferedReader.readLine();
        double s = Double.parseDouble(r);
        return s;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String e = bufferedReader.readLine();
        boolean b = Boolean.parseBoolean(e);
        return b;


    }

    public static void main(String[] args) throws Exception {

    }
}
