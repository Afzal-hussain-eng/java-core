package com.learning.core.day04session1.D04P09;

class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element: " + element);
            return;
        }
        stackArray[++top] = element;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}


public class StackUsingArray {
	 public static void main(String[] args) {
	        Stack stack = new Stack(5);
	        stack.push("Hello");
	        stack.push("world");
	        stack.push("java");
	        stack.push("Programming");
	        stack.display();

	        String poppedElement = stack.pop();
	        if (poppedElement != null) {
	            System.out.println("Popped element: " + poppedElement);
	        }
	        stack.display();
	    }
	}