package linkedlist.singlylinkedlist.withtail.examples.orderqueue;

public class OrderQueue {
    Node head;
    Node tail;
    public void add(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public void display(){
        Node tempNode = head;
        while (tempNode != null){
            System.out.print(tempNode.data+" ---> ");
            tempNode = tempNode.next;
        }
        System.out.print("END");
    }
}
