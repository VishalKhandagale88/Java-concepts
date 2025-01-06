package linkedlist.singlylinkedlist.withtail.examples.PrintQueue;

public class PrintQueue {
    Node head;
    Node tail;
    void add(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    void display(){
        Node tempNode = head;
        while (tempNode != null){
            System.out.println(tempNode.job+" --> ");
            tempNode = tempNode.next;
        }
        System.out.println("END");
    }
}
