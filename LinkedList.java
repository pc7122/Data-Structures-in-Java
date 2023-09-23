public class LinkedList {
    private Node head;
    private int length;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    LinkedList() {
        head = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isNull() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return true;
        }
        return false;
    }

    public void insertEnd(int data) {
        Node new_node = new Node(data);
        length++;

        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = new_node;
    }

    public void insertStart(int data) {
        Node new_node = new Node(data);
        length++;

        if (head == null) {
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }

    public void insertIndex(int data, int index) {
        if (index > length + 1) {
            System.out.println("Please, Enter valid index!");
            return;
        }

        Node new_node = new Node(data);
        Node temp = head;
        length++;

        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }
        new_node.next = temp.next;
        temp.next = new_node;
    }

    public void deleteEnd() {
        if (isNull())
            return;

        length--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    public void deleteStart() {
        if (isNull())
            return;
        head = head.next;
        length--;
    }

    public void deleteIndex(int index) {
        if (index == length)
            deleteEnd();
        if (index == 1)
            deleteStart();
        if (index >= length || index == 1)
            return;

        Node temp = head;
        for (int i = 1; i < index - 1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
        length--;
    }

    public Node revList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = revList(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    public void reverse() {
        head = revList(head);
    }

    public void show() {
        Node temp = head;
        System.out.println("\nElements of linked list:");
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertEnd(1);
        list.insertEnd(3);
        list.insertStart(0);
        list.insertIndex(2, 3);
        list.show();
        list.reverse();
        list.show();
        list.deleteIndex(3);
        list.show();
    }
}