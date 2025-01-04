package linkedlist.singlylinkedlist.withouttail.undo;

public class Main {
    public static void main(String[] args) {
        UndoFunctionality undoFunctionalityLinkedList = new UndoFunctionality();
        undoFunctionalityLinkedList.addState("Add");
        undoFunctionalityLinkedList.addState("To");
        undoFunctionalityLinkedList.addState("Undo");
        undoFunctionalityLinkedList.display();
    }
}
