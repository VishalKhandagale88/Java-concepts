package linkedlist.singlylinkedlist.withouttail.operations.recursivelengthofliinkedlist;

public class Main {
    public static void main(String[] args) {
        RecursiveLinkedListLength recursiveLinkedListLength = new RecursiveLinkedListLength();
        Node node = new Node(10);
        node.next = new Node(10);
        node.next.next = new Node(10);
        node.next.next.next = new Node(10);
        System.out.println(recursiveLinkedListLength.countNode(node));
    }
}
