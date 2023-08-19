package linkedlistexamples;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    void  insert(int data){
        Node newNode = new Node();
        if (head==null){
            head = newNode;
        }else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }

    }

}
