package Queue_implementation;

public class Queue_example {

    private int[] array;
    private int front;
    private int rear;

    private int capacity;
    private int count;

    public Queue_example(int size) {
        array = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Already full");
            System.exit(1);
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        count++;
    }


    public void dequeue() {
        if (isEmpty()) {
            System.out.println("No data");
            System.exit(1);
        }
        array[front] = 0;
        front = (front + 1) % capacity;
        count--;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("No data yet");
            System.exit(1);
        }
        return array[front];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Boolean isFull() {
        return size() == capacity;
    }

    public void printQueue() {
        for (int j : array) {
            System.out.println(j);
        }
    }

}
