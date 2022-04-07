package edu.neu.csye6200;

public class Driver {
    public static void main(String[] args) {    
        Queue1.demo();
        Queue2.demo();
        Stack1.demo();
        Stack2.demo();
    }
}

/*
 * CONSOLE OUTPUT
 * 

----------Queue----------

Adding 1
Adding 2
Adding 3
Front element in the Queue is: 1
Removing 1
Front element in the Queue is: 2
Queue size is 2
Removing 2
Removing 3
Queue Is Empty


----------Generic Queue----------

-----Demonstrate using int data type
Adding 7
Adding 2
Adding 3
Front element in Generic Queue is: 7
Removing 7
Front element in Generic Queue is: 2
Generic Queue size is 2
Removing 2
Removing 3
Generic Queue Is Empty

-----Demonstrate using float data type
Adding 7.2
Adding 2.34
Adding 3.3
Front element in Generic Queue is: 7.2
Removing 7.2
Front element in Generic Queue is: 2.34
Generic Queue size is 2
Removing 2.34
Removing 3.3
Generic Queue Is Empty

-----Demonstrate using char data type
Adding a
Adding !
Adding 2
Front element in Generic Queue is: a
Removing a
Front element in Generic Queue is: !
Generic Queue size is 2
Removing !
Removing 2
Generic Queue Is Empty


----------Stack----------

Inserting 1
Inserting 2
Top element in Stack is: 2
Removing 2
Stack size is 1
Inserting 3
Top element in Stack is: 3
Stack size is 2
Removing 3
Removing 1
Stack Is Empty


----------Generic Stack----------

-----Demonstrate using int data type
Inserting 1
Inserting 2
Top element in Stack is: 2
Removing 2
Stack size is 1
Inserting 3
Top element in Stack is: 3
Stack size is 2
Removing 3
Removing 1
Stack Is Empty

-----Demonstrate using float data type
Inserting 7.2
Inserting 2.34
Top element in Stack is: 2.34
Removing 2.34
Stack size is 1
Inserting 3.3
Top element in Stack is: 3.3
Stack size is 2
Removing 3.3
Removing 7.2
Stack Is Empty

-----Demonstrate using char data type
Inserting a
Inserting !
Top element in Stack is: !
Removing !
Stack size is 1
Inserting 2
Top element in Stack is: 2
Stack size is 2
Removing 2
Removing a
Stack Is Empty

*/
