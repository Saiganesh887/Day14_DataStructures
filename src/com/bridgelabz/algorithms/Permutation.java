package com.bridgelabz.algorithms;

import java.util.Scanner;

public class Permutation {
    public static void permutation(String str,String ans){
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String x1 = str.substring(0,i) + str.substring(i+1);
            permutation(x1,ans + ch);
        }
    }
    public static void main(String[] args) {
        System.out.println("Permutation problem starts.");
        String x = "";
        permutation("abcd",x);
    }
}
