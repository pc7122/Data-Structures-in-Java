public class StackLL {
    Node top;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public StackLL() {
        top = null;
    }

    public boolean isUnderflow() {
        return top == null;
    }

    public void push(int data) {
        Node new_node = new Node(data);
        if (isUnderflow()) {
            top = new_node;
            return;
        }
        new_node.next = top;
        top = new_node;
    }

    public int pop() {
        if (isUnderflow()) {
            System.out.println("Linked List is empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public void show() {
        if (isUnderflow()) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = top;
        System.out.println("\nElements of linked list:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.show();
        System.out.println("\n"+stack.pop());
        stack.show();
    }
}
