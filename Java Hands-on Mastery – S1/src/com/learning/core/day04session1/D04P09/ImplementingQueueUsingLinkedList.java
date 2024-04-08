package com.learning.core.day04session1.D04P09;
class Noode {
    int data;
    Noode next;

    public Noode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class ImplementingQueueUsingLinkedList {
	 private Noode front;
	    private Noode rear;

	    public ImplementingQueueUsingLinkedList() {
	        this.front = null;
	        this.rear = null;
	    }

	    public void enqueue(int data) {
	        Noode newNode = new Noode(data);
	        if (isEmpty()) {
	            front = newNode;
	            rear = newNode;
	        } else {
	            rear.next = newNode;
	            rear = newNode;
	        }
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1;
	        }
	        int removedElement = front.data;
	        front = front.next;
	        if (front == null) {
	            rear = null; // Reset rear if queue becomes empty after dequeue
	        }
	        return removedElement;
	    }

	    public boolean isEmpty() {
	        return front == null;
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        Noode temp = front;
	        System.out.print("Elements in queue: ");
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	ImplementingQueueUsingLinkedList queue = new ImplementingQueueUsingLinkedList();
	        queue.enqueue(89);
	        queue.enqueue(99);
	        queue.enqueue(109);
	        queue.enqueue(209);
	        queue.enqueue(309);

	        queue.display();

	        queue.dequeue();
	        queue.dequeue();

	        System.out.println("After removing two elements: ");
	        queue.display();
	    }
	}