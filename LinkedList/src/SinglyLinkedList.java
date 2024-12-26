public class SinglyLinkedList {
    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void getNodeByPosition(int index) {
        if (head == null) {
            return;
        }
        Node temp = head;
        int currentIndex = 0;
        while (temp != null) {
            if (currentIndex == index) {
                System.out.println("\n" + temp.getData());
                return;
            }
            temp = temp.next;
            currentIndex++;
        }
        System.out.println("\nInvalid");
    }

    public void add(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        Node preNode = null;
        int count = 0;
        while (temp.next != null) {
            if (count == index) {
                break;
            }
            preNode = temp;
            temp = temp.next;
            count++;
        }
        newNode.next = temp;
        preNode.next = newNode;

    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        // Node delNode = head;
        System.out.println("Node da xoa la: " + head.getData());
        head = head.next;
        // return delNode;
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        //C1
        // Node temp = head;
        // Node preNode = null;
        // while (temp.next != null) {
        //     preNode = temp;
        //     temp = temp.next;
        // }
        // preNode.next = null;
        //C2
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public Node removeNode(int index){
        if (head == null) {
            return null;
        }
        Node temp = head;
        Node preNode = null;
        int currentIndex = 0;
        while(temp.next != null){
            if(currentIndex == index){
                break;
            }
            preNode = temp;
            temp = temp.next;
            currentIndex++;
        }
        Node delNode = temp;
        preNode.next = temp.next;
        return delNode;
    }

    public void printListNode() {
        Node temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.getData() + "->");
            } else {
                System.out.print(temp.getData() + "");
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addLast(1);
        linkedList.addLast(3);
        linkedList.addLast(5);
        linkedList.addLast(2);
        linkedList.addLast(9);
        linkedList.addLast(2);
        linkedList.add(1, 1);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeNode(3);
        // linkedList.getNodeByPosition(3);
        linkedList.printListNode();
    }
}
