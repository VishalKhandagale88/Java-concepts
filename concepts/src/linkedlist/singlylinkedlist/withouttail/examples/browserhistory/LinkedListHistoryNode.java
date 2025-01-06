package linkedlist.singlylinkedlist.withouttail.examples.browserhistory;

public class LinkedListHistoryNode {
    HistoryNode head;
    void addHistory(String data){
        HistoryNode historyNode = new HistoryNode(data);
        if (head == null){
            head = historyNode;
        } else{
           HistoryNode tempNode = head;
           while (tempNode.next != null){
               tempNode = tempNode.next;
           }
           tempNode.next = historyNode;
        }
    }
    void display(){
        if (head == null){
            System.out.println("Empty linked list");
            return;
        }
        HistoryNode tempNode = head;
        while (tempNode != null){
            System.out.println(tempNode.data+"-->");
            tempNode = tempNode.next;
        }
        System.out.println("End of linked list");
    }
}
