package com.bridgelabz.datastructures;

import com.bridgelabz.stack.Stack;

import java.util.Arrays;

public class PrimeAnagramUsingStack {public static boolean isPrime(int num) {
    boolean flag = true;
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            flag = false;
            break;
        }
    }
    return flag;
}
//    public static boolean isAnagram(int str1, int str2) {
//        char[] array1 = str1.toCharArray();
//        char[] array2 = str2.toCharArray();
//
//        // Sorting Both character Arrays
//        Arrays.sort(array1);
//        Arrays.sort(array2);
//
//        // if both the arrays are equal after sorting then they are Anagram else not
//        if (Arrays.equals(array1, array2)) // condition will check the return value is true or not
//            return true;
//        else
//            return false;
//
//    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // logic to push the prime number into stack
        for (int i = 2; i <= 1000; i++)
        {
            if (isPrime(i))
            {
                stack.push(i);
            }
        }

        // logic to store prime numbers from stack to array
        int size = stack.size();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = stack.pop();
        }

        // logic to check prime numbers are anagram or not
        System.out.println("Anagrams \t Primes");
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
//                if (isAnagram(array[i], array[j]) && array[i] != 0 && array[j] != 0)
//                {
//                    System.out.println(array[i] + " \t\t " + array[j]);
//                }
            }
        }
    }
}
