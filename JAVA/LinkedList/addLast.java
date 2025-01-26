import java.lang.classfile.instruction.ThrowInstruction;
import java.util.*;

public class addLast{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addLastOp(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args){
        addLast ll = new addLast();
        addLastOp(3);
        addLastOp(2);

        System.out.println(head.data);
        System.out.println(tail.data);
    }
}