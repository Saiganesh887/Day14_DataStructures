package com.bridgelabz.algorithms;

import java.util.Scanner;

public class Anagram {
    private static void anagramDetection(char[] firstArray, char[] secondArray) {
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    count += 1;
                }
            }
        }
        if (count == firstArray.length){
            System.out.println("Both strings are anagram");
        }else {
            System.out.println("Both strings are not anagram");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String:");
        String firstString = sc.next();
        System.out.println("Enter second string:");
        String secondString = sc.next();
        if (firstString.length() != secondString.length()) {
            System.out.println("Both string are not anagram");
        }else {
            char[] firstArray = firstString.toCharArray();
            char[] secondArray = secondString.toCharArray();
            anagramDetection(firstArray, secondArray);
        }
    }
}
