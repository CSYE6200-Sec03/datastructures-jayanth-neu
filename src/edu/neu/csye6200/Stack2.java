package edu.neu.csye6200;

public class Stack2<T> {

    private T[] arr;
    private int capacity;
    private int top;

    @SuppressWarnings("unchecked")
	public Stack2(int size) {
        arr = (T[]) new Object[size];
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

    public void push(T item) {
        if (isFull()) {
            System.exit(1); // ERROR
        }
        System.out.println("Inserting " + item);
        arr[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            System.exit(1); // ERROR
        }
        System.out.println("Removing " + peek());
        return arr[top--];
    }

    public T peek() {
        if (isEmpty()) {
            System.exit(1); // ERROR
        }
           return arr[top];

    }
    public static void demo() {
    	System.out.println("\n\n----------Generic Stack----------\n");
    	
    	//Demonstration using int data type
    	System.out.println("-----Demonstrate using int data type");
        Stack2<Integer> q1 = new Stack2<>(5);
        q1.push(1); // 1st in
        q1.push(2); // 2nd in
        System.out.println("Top element in Stack is: " + q1.peek());
        q1.pop(); // 1st out is 2
        System.out.println("Stack size is " + q1.size());
        q1.push(3); // 3rd in
        System.out.println("Top element in Stack is: " + q1.peek());
        System.out.println("Stack size is " + q1.size());
        q1.pop(); // 2nd out is 3
        q1.pop(); // 3rd out is 1
        if ( q1.isEmpty() )
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
        
    	//Demonstration using float data type
    	System.out.println("\n-----Demonstrate using float data type");
        Stack2<Float> q2 = new Stack2<>(5);
        q2.push(7.2f); // 1st in
        q2.push(2.34f); // 2nd in
        System.out.println("Top element in Stack is: " + q2.peek());
        q2.pop(); // 1st out is 2.34
        System.out.println("Stack size is " + q2.size());
        q2.push(3.3f); // 3rd in
        System.out.println("Top element in Stack is: " + q2.peek());
        System.out.println("Stack size is " + q2.size());
        q2.pop(); // 2nd out is 3.3
        q2.pop(); // 3rd out is 7.2
        if ( q2.isEmpty() )
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
        
    	//Demonstration using char data type
    	System.out.println("\n-----Demonstrate using char data type");
        Stack2<Character> q3 = new Stack2<>(5);
        q3.push('a'); // 1st in
        q3.push('!'); // 2nd in
        System.out.println("Top element in Stack is: " + q3.peek());
        q3.pop(); // 1st out is '!'
        System.out.println("Stack size is " + q3.size());
        q3.push('2'); // 3rd in
        System.out.println("Top element in Stack is: " + q3.peek());
        System.out.println("Stack size is " + q3.size());
        q3.pop(); // 2nd out is '2'
        q3.pop(); // 3rd out is 'a'
        if ( q3.isEmpty() )
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
    }
}
