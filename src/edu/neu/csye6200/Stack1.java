package edu.neu.csye6200;

public class Stack1 {

    private int[] arr;
    private int capacity;
    private int top;

    public Stack1(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    
    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public void push(int item) {
        if (isFull()) {
            System.exit(1); // ERROR
        }
        System.out.println("Inserting " + item);
                arr[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.exit(1); // ERROR
        }
        System.out.println("Removing " + peek());
        return arr[top--];
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(1); // ERROR
        }
        return -1;
    }
    public static void demo() {
    	System.out.println("\n\n----------Stack----------\n");
        Stack1 q = new Stack1(5);
        q.push(1); // 1st in
        q.push(2); // 2nd in
        System.out.println("Top element in Stack is: " + q.peek());
        q.pop(); // 1st out is 2
        System.out.println("Stack size is " + q.size());
        q.push(3); // 3rd in
        System.out.println("Top element in Stack is: " + q.peek());
        System.out.println("Stack size is " + q.size());
        q.pop(); // 2nd out is 3
        q.pop(); // 3rd out is 1
        if ( q.isEmpty() )
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
    }
}
