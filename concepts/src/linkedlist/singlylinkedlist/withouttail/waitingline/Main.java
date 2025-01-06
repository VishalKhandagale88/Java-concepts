package linkedlist.singlylinkedlist.withouttail.waitingline;

public class Main {

    public static void main(String[] args) {
        WaitingListManager waitingListManager = new WaitingListManager();
        waitingListManager.add("Person 1");
        waitingListManager.add("Person 2");
        waitingListManager.add("Person 3");
        waitingListManager.add("Person 4");
        waitingListManager.add("Person 5");
        waitingListManager.printAllList();
    }
}
