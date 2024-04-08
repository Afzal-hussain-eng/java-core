package com.learning.core.day04session1.D04P09;

public class ImplementingCircularQueueUsingArray {
	 private int[] queue;
	    private int front;
	    private int rear;
	    private int size;
	    private int capacity;

	    public ImplementingCircularQueueUsingArray(int capacity) {
	        this.capacity = capacity;
	        this.queue = new int[capacity];
	        this.front = 0;
	        this.rear = -1;
	        this.size = 0;
	    }

	    public void enqueue(int data) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue.");
	            return;
	        }
	        rear = (rear + 1) % capacity;
	        queue[rear] = data;
	        size++;
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1;
	        }
	        int removedElement = queue[front];
	        front = (front + 1) % capacity;
	        size--;
	        return removedElement;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public boolean isFull() {
	        return size == capacity;
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        System.out.print("Elements in circular queue: ");
	        int count = 0;
	        int index = front;
	        while (count < size) {
	            System.out.print(queue[index] + " ");
	            index = (index + 1) % capacity;
	            count++;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	ImplementingCircularQueueUsingArray queue = new ImplementingCircularQueueUsingArray(5);
	        queue.enqueue(14);
	        queue.enqueue(13);
	        queue.enqueue(22);
	        queue.enqueue(-8);

	        queue.display();

	        queue.dequeue();

	        System.out.println("After removing first element: ");
	        queue.display();
	    }
	}