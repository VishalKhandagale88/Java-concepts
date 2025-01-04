package linkedlist.singlylinkedlist.withouttail.taskmanagement;

public class TaskNode {
    String taskName;
    TaskNode next;

     TaskNode(String taskName){
        this.taskName = taskName;
        this.next = null;
    }
}
