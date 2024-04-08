package com.learning.core.day04session1.D04P09;

public class ImplementingQueueUsingArray {

    private static final int MAX_SIZE = 100;
    private int[] queue;
    private int front;
    private int rear;

    public ImplementingQueueUsingArray() {
        queue = new int[MAX_SIZE];
        front = 0;
        rear = -1;
    }

    public void enqueue(int data) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        queue[++rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedElement = queue[front++];
        return removedElement;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	ImplementingQueueUsingArray queue = new ImplementingQueueUsingArray();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        int removedElement = queue.dequeue();
        System.out.println("After removing first element: ");
        queue.display();
    }
}