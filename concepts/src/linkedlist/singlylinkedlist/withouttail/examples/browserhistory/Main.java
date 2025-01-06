package linkedlist.singlylinkedlist.withouttail.examples.browserhistory;

public class Main {
    public static void main(String[] args) {
        LinkedListHistoryNode linkedListHistoryNode = new LinkedListHistoryNode();
        linkedListHistoryNode.addHistory("Hello world");
        linkedListHistoryNode.addHistory("100 RBH");
        linkedListHistoryNode.addHistory("paradox");
        linkedListHistoryNode.addHistory("rom rom");
        linkedListHistoryNode.addHistory("saitan");
        linkedListHistoryNode.display();

    }
}
