package linkedlist.singlylinkedlist.withouttail.examples.taskmanagement;

public class TaskNode {
    String taskName;
    TaskNode next;

     TaskNode(String taskName){
        this.taskName = taskName;
        this.next = null;
    }
}
