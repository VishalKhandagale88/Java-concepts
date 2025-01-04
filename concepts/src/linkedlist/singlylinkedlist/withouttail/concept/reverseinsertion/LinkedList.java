package linkedlist.singlylinkedlist.withouttail.concept.reverseinsertion;

public class LinkedList {
    Node head;

    void add(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    void display(){
        Node tempNode = head;
        while (tempNode != null){
            System.out.println(tempNode.data+" --> ");
            tempNode = tempNode.next;
        }
    }
}
