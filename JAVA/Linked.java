public class Linked {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add in middle
    public void add(int data, int idx) {
        Node newNode = new Node(data);
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first
    public void remFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    // Print linked list
    public void print() {
        if (head == null) {
            System.out.println("No linked list found");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linked ll = new Linked();

        ll.add(2, 0);
        ll.print();
        ll.add(4, 1);
        ll.print();
        ll.add(6, 2);
        ll.print();
        ll.add(8, 3);
        ll.print();

        // Test remove first
        ll.remFirst();
        ll.print();
        ll.remFirst();
        ll.print();
    }
}
