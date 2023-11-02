package DSAPrograms.Queue;

class Queue {
    private int maxSize;
    private int front, rear, size;
    private int[] queueArray;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    // Add an element to the rear of the queue (enqueue)
    public void enqueue(int value) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;  // Circular increment of rear
            queueArray[rear] = value;
            size++;
            System.out.println("Enqueued " + value + " into the queue.");
        } else {
            System.out.println("Queue is full. Cannot enqueue " + value);
        }
    }

    // Remove and return an element from the front of the queue (dequeue)
    public int dequeue() {
        if (!isEmpty()) {
            int value = queueArray[front];
            front = (front + 1) % maxSize;  // Circular increment of front
            size--;
            System.out.println("Dequeued " + value + " from the queue.");
            return value;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;  // Return -1 or throw an exception for an empty queue
        }
    }

    // Peek at the front element without removing it
    public int peek() {
        if (!isEmpty()) {
            int value = queueArray[front];
            System.out.println("Front element is: " + value);
            return value;
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;  // Return -1 or throw an exception for an empty queue
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == maxSize;
    }
}

public class QueueOperations {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Is the queue full? " + queue.isFull());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Is the queue full? " + queue.isFull());

        queue.peek();
        queue.dequeue();
        queue.peek();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Is the queue full? " + queue.isFull());
    }
}

