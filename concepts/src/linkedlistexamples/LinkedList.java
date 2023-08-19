package linkedlistexamples;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void  insert(int data){
        Node newNode = new Node(data);
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

    public void display(){
        Node currentNode = head;
        while (currentNode!=null){
            System.out.println(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}
