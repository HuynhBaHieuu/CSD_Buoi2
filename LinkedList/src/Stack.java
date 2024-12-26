// import java.util.LinkedList;

public class Stack {
    private Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top; 
        top = newNode; 
        System.out.println("Pushed: " + value);
    }

    
    public int pop() {
        if (top == null) {
            return -1; 
        }
        int value = top.getData();
        top = top.next; 
        System.out.println("Popped: " + value);
        return value;
    }
    public void print() {
        Node temp = top;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.getData() + "\n");
            } else {
                System.out.print(temp.getData() + "");
            }
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30); 
        // stack.pop(); // Xóa phần tử 30
        // stack.pop(); // Xóa phần tử 20
        stack.print();
    }
}
