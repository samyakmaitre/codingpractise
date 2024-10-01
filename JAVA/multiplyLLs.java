import java.util.*;

class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}

class LinkedList{
    Node head;
    int data;
    Node tail;

    LinkedList(int data){
        this.data = data;
        head.next = tail;
    }
}

public class multiplyLLs {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList();
    }
}
