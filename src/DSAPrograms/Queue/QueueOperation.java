package DSAPrograms.Queue;

public class QueueOperation {
	private int maxSize;
	private int front;
	private int rear;
	private int[] queueArray;

	public QueueOperation(int size) {
		maxSize = size;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
	}

	// Add an element to the rear of the queue (enqueue)
	public void enqueue(int value) {
		if (!isFull()) {
			rear++;
			queueArray[rear] = value;
			System.out.println("Enqueued " + value + " at " + rear);
		} else {
			System.out.println("Queue is full. Cannot enqueue " + value);
		}
	}

	// Remove and return an element from the front of the queue (dequeue)
	public int dequeue() {
		if (!isEmpty()) {
			int value = queueArray[front];
			front++;
			return value;
		} else {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1;
		}
	}

	// Peek at the front element without removing it
	public int peek() {
		if (!isEmpty()) {
			return queueArray[front];
		} else {
			System.out.println("Queue is empty. Cannot peek.");
			return -1;
		}
	}

	// Check if the queue is empty
	public boolean isEmpty() {
		return front > rear;
	}

	// Check if the queue is full
	public boolean isFull() {
		return rear == maxSize - 1;
	}

	public static void main(String[] args) {
		QueueOperation queue = new QueueOperation(5);

		System.out.println("Is the queue empty? " + queue.isEmpty());
		System.out.println("Is the queue full? " + queue.isFull());

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Is the queue empty? " + queue.isEmpty());
		System.out.println("Is the queue full? " + queue.isFull());

		System.out.println("Peek " + queue.peek());
		System.out.println("Dequeued " + queue.dequeue());
		System.out.println("Peek " + queue.peek());

		System.out.println("Dequeued " + queue.dequeue());
		System.out.println("Dequeued " + queue.dequeue());
		System.out.println("Dequeued " + queue.dequeue());

		System.out.println("Is the queue empty? " + queue.isEmpty());
		System.out.println("Is the queue full? " + queue.isFull());
	}
}
