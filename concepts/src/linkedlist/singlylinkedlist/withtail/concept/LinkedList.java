package linkedlist.singlylinkedlist.withtail.concept;

public class LinkedList {
    Node head;
    Node tail;
    void addAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head= newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    void display(){
        if (head == null) return;
        Node tempNode = head;
        while (tempNode != null){
            System.out.print(tempNode.data + "-->");
            tempNode = tempNode.next;
        }

    }
}
