package linkedlist.singlylinkedlist.withouttail.operations.lengthofliinkedlist;

public class Main {
    public static void main(String[] args) {
        LengthOfLinkedList lengthOfLinkedList = new LengthOfLinkedList();
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(2);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(4);
        System.out.println(lengthOfLinkedList.length(node)+" Node is here");
    }
}

