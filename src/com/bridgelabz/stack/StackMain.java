package com.bridgelabz.stack;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        System.out.println(obj);

        obj.pop();
        System.out.println(obj);


    }
}
