public class Queue {
    private Node front; // Điểm đầu của Queue
    private Node rear;  // Điểm cuối của Queue

    // public Queue() {
    //     front = null;
    //     rear = null;
    // }

    // Thêm phần tử vào cuối Queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { 
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode; 
            rear = newNode;      
        }
        System.out.println("Enqueued: " + value);
    }

    // Lấy phần tử từ đầu Queue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1; 
        }
        int value = front.getData();
        front = front.next; 
        if (front == null) { 
            rear = null;
        }
        System.out.println("Dequeued: " + value);
        return value;
    }
    public void print() {
        Node temp = front;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.getData() + "-");
            } else {
                System.out.print(temp.getData() + "");
            }
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        // queue.dequeue(); // Xóa phần tử 10
        // queue.dequeue(); // Xóa phần tử 20
        queue.print();
    }
}
