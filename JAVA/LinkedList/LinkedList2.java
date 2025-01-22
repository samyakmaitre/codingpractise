public class LinkedList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void traverse(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data); // Print the data instead of the object
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(4);

        traverse(head);
    }
}
