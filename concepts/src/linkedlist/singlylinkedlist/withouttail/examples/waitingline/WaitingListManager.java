package linkedlist.singlylinkedlist.withouttail.examples.waitingline;

public class WaitingListManager {
    PersonNode head;
    public void add(String name){
        PersonNode newPerson = new PersonNode(name);
        if (head == null)
            head = newPerson;
        else{
            PersonNode tempPersonNode = head;
            while (tempPersonNode.next != null){
                tempPersonNode = tempPersonNode.next;
            }
            tempPersonNode.next = newPerson;
        }
    }
    public void printAllList(){
        PersonNode tempPersonNode = head;
        if (tempPersonNode == null) {
            System.out.println("Empty Queue");
            return;
        }
        while (tempPersonNode != null){
            System.out.println(tempPersonNode.name);
            tempPersonNode = tempPersonNode.next;
        }
    }
}
