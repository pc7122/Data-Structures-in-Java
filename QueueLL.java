public class QueueLL {
    Node front, rear;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public QueueLL() {
        front = rear = null;
    }

    public boolean isUnderflow() {
        return front == null && rear == null;
    }

    public void insert(int data) {
        Node new_node = new Node(data);
        if (isUnderflow()) {
            front = rear = new_node;
            return;
        }
        rear.next = new_node;
        rear = rear.next;
    }

    public int pop() {
        if (isUnderflow()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        return data;
    }

    public void show() {
        if (isUnderflow()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.println("\nElements of linked list:");
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.insert(0);
        queue.insert(1);
        queue.insert(2);
        queue.show();
        queue.pop();
        queue.show();
    }
}
