package linkedlist.singlylinkedlist.withouttail.concept.insertion;

public class LinkedList {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            Node tempNode = head;
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }
    public void display(){
        Node tempNode = head;
        while (tempNode != null){
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }
}
