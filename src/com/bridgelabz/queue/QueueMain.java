package com.bridgelabz.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.enQueue(10);
        obj.enQueue(20);
        System.out.println(obj);

        obj.deQueue();
        System.out.println(obj);
    }
}
