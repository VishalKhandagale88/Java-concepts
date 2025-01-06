package linkedlist.singlylinkedlist.withouttail.examples.undo;

public class UndoFunctionality {
    Node head;
    void addState(String data){
        Node newState = new Node(data);
        if (head == null){
            head = newState;
        }else {
            Node tempNode = head;
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newState;
        }
    }
    void display(){
        Node tempNode = head;
        if (tempNode == null){
            System.out.println("Empty lined list");
            return;
        }
        while (tempNode != null){
            System.out.println(tempNode.state+"-->");
            tempNode =tempNode.next;
        }
    }
}
