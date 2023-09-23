public class Stack {
    private int top;
    private final int size;
    private final int[] stack;

    public Stack(int size) {
        top = -1;
        this.size = size;
        stack = new int[size];
    }

    public boolean isOverflow() {
        return top == size - 1;
    }

    public boolean isUnderflow() {
        return top == -1;
    }

    public void push(int value) {
        if (isOverflow()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public void show() {
        if (isUnderflow()) {
            System.out.println("Stack is empty, nothing to show");
            return;
        }

        System.out.println("Elements of stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(0);
        s.push(1);
        s.push(2);
        System.out.println("Peek: " + s.peek());
        System.out.println("Popped: " + s.pop());
        s.show();
    }
}