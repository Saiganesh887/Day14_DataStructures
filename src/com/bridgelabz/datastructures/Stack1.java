package com.bridgelabz.datastructures;

public class Stack1 {
    int capacity = 2;
    int top = 0;
    int [] stack = new int[capacity];

    public void push(int data)
    {
        if(size() == capacity)
            expand();
        stack[top] = data;
        top++;

    }
    private void expand()
    {
        int length = size();
        int [] newStack = new int[capacity*2];

        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;
    }
    public char pop()
    {
        char data = 0;

        if(isEmpty())
            System.out.println("Stack is Empty..!!");
        else
        {
            top--;
            data = (char) stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    private void shrink()
    {
        int length = size();
        if(length <= (capacity/2)/2)
            capacity = capacity/2;
        int [] newStack = new int [capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
    }
    public int peek()
    {
        int data;
        data = stack[top - 1];
        return data;
    }

    public int size()
    {
        return top;
    }

    public boolean isEmpty()
    {
        return top <= 0;
    }

    public void show()
    {
        for(int n : stack)
            System.out.println(n + " ");
        System.out.println();
    }
}
