public class addFirst {
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

    public void addFirstOp(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        addFirst ll = new addFirst();
        ll.addFirstOp(1);
        ll.addFirstOp(2);
        ll.addFirstOp(4);
    }
}
