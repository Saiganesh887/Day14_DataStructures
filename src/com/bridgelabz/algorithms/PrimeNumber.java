package com.bridgelabz.algorithms;

import java.util.Scanner;

public class PrimeNumber {
    public static int i, j, count;
    private static void findPrimeNumber(int lowerLimit, int upperLimit) {
        for (i = lowerLimit; i <= upperLimit; i++) {
            count = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    count = 0;
                    break;
                }
            }
            if (count == 1)
                System.out.println(i);
        }
    }
    public static void checkPalindrome(int n){
        int temp,r,sum = 0;
        temp=n;
        while(n>0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerLimit, upperLimit;

        System.out.print("Enter lower limit of the range between 0 to 1000 : ");
        lowerLimit = scanner.nextInt();

        System.out.print("Enter upper limit of the range between " + lowerLimit + " to 1000 : ");
        upperLimit = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerLimit + " " + upperLimit + " and are: ");
        findPrimeNumber(lowerLimit, upperLimit);
    }
}
