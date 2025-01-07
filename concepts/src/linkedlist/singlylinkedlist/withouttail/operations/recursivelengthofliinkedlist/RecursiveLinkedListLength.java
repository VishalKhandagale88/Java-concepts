package linkedlist.singlylinkedlist.withouttail.operations.recursivelengthofliinkedlist;

public class RecursiveLinkedListLength {
    public int countNode(Node node){
        if (node == null){
            return 0;
        }
        return 1 + countNode(node.next);
    }
}
