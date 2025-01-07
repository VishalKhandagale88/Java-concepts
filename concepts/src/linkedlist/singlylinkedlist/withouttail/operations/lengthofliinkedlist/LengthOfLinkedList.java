package linkedlist.singlylinkedlist.withouttail.operations.lengthofliinkedlist;

public class LengthOfLinkedList {
    public int length(Node node){
        int length = 0;
        Node tempNode = node;
        while (tempNode != null){
            length++;
            tempNode = tempNode.next;
        }
        return length;
    }
}
