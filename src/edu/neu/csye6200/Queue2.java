package edu.neu.csye6200;

public class Queue2<T> {

    private T[] arr;
    private int capacity;
    private int front;
    private int rear;
    private int count;
    
    @SuppressWarnings("unchecked")
	public Queue2(int size) {
        arr = (T[]) new Object[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    
    public int size() {
        return count;
    }
    
    public boolean isEmpty() {
        return (size() == 0);
    }

    public boolean isFull() {
        return (size() == capacity);
    }

    public void enqueue(T item) {
        if (isFull()) {
            System.exit(1); // ERROR
        }
        System.out.println("Adding " + item);
        rear = (rear + 1) % capacity; // circular index
        arr[rear] = item;
        count++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.exit(1); // ERROR
        }
        System.out.println("Removing " + arr[front]);
        front = (front + 1) % capacity; // circular index
        count--;
    }

    public T peek() {
        if (isEmpty()) {
            System.exit(1); // ERROR
        }
        return arr[front];
    }

    public static void demo() {
    	System.out.println("\n\n----------Generic Queue----------\n");
    	
    	//Demonstration using int data type
    	System.out.println("-----Demonstrate using int data type");
        Queue2<Integer> q1 = new Queue2<>(5);
        q1.enqueue(7); // 1st in
        q1.enqueue(2); // 2nd in
        q1.enqueue(3); // 3rd in
        System.out.println("Front element in Generic Queue is: " + q1.peek());
        q1.dequeue(); // 1st out is 7
        System.out.println("Front element in Generic Queue is: " + q1.peek());
        System.out.println("Generic Queue size is " + q1.size());
        q1.dequeue(); //2nd out is 2
        q1.dequeue(); // 3rd out is 3
        if ( q1.isEmpty() )
            System.out.println("Generic Queue Is Empty");
        else
            System.out.println("Generic Queue Is Not Empty");
        
    	//Demonstration using float data type
    	System.out.println("\n-----Demonstrate using float data type");
        Queue2<Float> q2 = new Queue2<>(5);
        q2.enqueue(7.2f); // 1st in
        q2.enqueue(2.34f); //2nd in
        q2.enqueue(3.3f); //3rd in
        System.out.println("Front element in Generic Queue is: " + q2.peek());
        q2.dequeue(); // 1st out is 7.2
        System.out.println("Front element in Generic Queue is: " + q2.peek());
        System.out.println("Generic Queue size is " + q2.size());
        q2.dequeue(); // 2nd out is 2.34
        q2.dequeue(); // 3rd out is 3.3
        if ( q2.isEmpty() )
            System.out.println("Generic Queue Is Empty");
        else
            System.out.println("Generic Queue Is Not Empty");  
        
    	//Demonstration using char data type
    	System.out.println("\n-----Demonstrate using char data type");
        Queue2<Character> q3 = new Queue2<>(5);
        q3.enqueue('a'); // 1st in
        q3.enqueue('!'); // 2nd in
        q3.enqueue('2'); // 3rd in
        System.out.println("Front element in Generic Queue is: " + q3.peek());
        q3.dequeue(); // 1st out is 'a'
        System.out.println("Front element in Generic Queue is: " + q3.peek());
        System.out.println("Generic Queue size is " + q3.size());
        q3.dequeue(); // 2nd out is '!'
        q3.dequeue(); // 3rd out is '2'
        if ( q3.isEmpty() )
            System.out.println("Generic Queue Is Empty");
        else
            System.out.println("Generic Queue Is Not Empty");         
    }
}
