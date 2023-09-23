public class Queue {
    private int rear;
    private int front;
    private final int size;
    private final int[] queue;

    public Queue(int size) {
        this.size = size;
        front = rear = -1;
        queue = new int[size];
    }

    public boolean isFull() {
        return rear >= size - 1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1)
            front++;

        queue[++rear] = value;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front++];
    }

    public void show() {
        if(isEmpty()) {
            System.out.println("\nQueue is empty");
            return;
        }
        System.out.println("\nElements of queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(0);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.show();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.show();
    }
}