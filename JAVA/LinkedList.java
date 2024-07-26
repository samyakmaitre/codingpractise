public class LinkedList{

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    

    //Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    //Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next= newNode;
            tail = newNode;
        }
    }

    //Add in middle
    public void add(int idx, int data){
        if(idx<0){
            throw new IndexOutOfBoundsException("index cant be negative");
        }
        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        
        Node temp = head;
        int i = 0;
        
        while(i<idx-1 && q)
    }



    public static void main(String args[]){

    }
}