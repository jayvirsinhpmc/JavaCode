package DSAPrograms.Stack;

class Stack {
    private int maxSize;    // Maximum size of the stack
    private int top;        // Index of the top element
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Initialize the top to -1 for an empty stack
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;  // Increment top and add the value
            System.out.println("Pushed " + value + " onto the stack.");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (top >= 0) {
            int value = stackArray[top--];  // Decrement top and return the value
            System.out.println("Popped " + value + " from the stack.");
            return value;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  // Return -1 or throw an exception for an empty stack
        }
    }

    // Peek at the top element without removing it
    public int peek() {
        if (top >= 0) {
            int value = stackArray[top];  // Return the top element
            System.out.println("Top element is: " + value);
            return value;
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;  // Return -1 or throw an exception for an empty stack
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create a stack with a maximum size of 5

        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Is the stack full? " + stack.isFull());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Is the stack full? " + stack.isFull());

        stack.peek();
        stack.pop();
        stack.peek();

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Is the stack full? " + stack.isFull());
    }
}
