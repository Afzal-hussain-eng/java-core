package com.learning.core.day04session1.D04P09;

import java.util.EmptyStackException;

class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
    }
}

class Stac {
    private Node top;

    public void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        double data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class StackUsingLinkedList {
	  public static void main(String[] args) {
	        Stac stack = new Stac();
	        double[] elements = {10.0, 20.0, 30.0, 40.0};

	        for (double element : elements) {
	            stack.push(element);
	        }

	        stack.printStack();

	        stack.pop();
	        stack.pop();

	        stack.printStack();
	    }
	}