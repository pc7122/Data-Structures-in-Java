public class DLinkedList {
    Node head, tail;
    private int length;

    public static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        length++;
        while (curr.next != null)
            curr=curr.next;
        curr.next = newNode;
        newNode.prev = curr;
    }

    public void show() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while(curr !=null) {
            System.out.print(curr.data+"<->");
            curr=curr.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.insertEnd(1);
        list.insertEnd(2);
        list.show();
    }
}
