package org.seminars;import java.util.Arrays;import java.util.Collections;import java.util.List;public class Task2 {    public static void main(String[] args) {        System.out.println(myRevers("Welcome to the Java Course"));        System.out.println(myRevers_2("Welcome to the Java Course"));    }    public static String myRevers(String str) {        String[] arr = str.split(" ");        StringBuilder res = new StringBuilder();        for (int i = arr.length - 1; i >= 0; i--) {            res.append(arr[i]).append(" ");        }        return res.toString();    }    public static String myRevers_2(String str) {        String[] arr = str.split(" ");        List<String> strings = Arrays.asList(arr);        Collections.reverse(strings);        return strings.toString();    }}