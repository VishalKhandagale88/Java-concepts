package linkedlist.singlylinkedlist.withouttail.taskmanagement;

public class TasksManager {
    TaskNode head;
    public void addTask(String data){
        TaskNode newTaskNode = new TaskNode(data);
        if (head == null){
            head =  newTaskNode;
        }else {
            TaskNode tempNode = head;
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newTaskNode;
        }
    }

    public void displayAllTasks(){
        if (head == null){
            System.out.println("No tasks listed");
            return;
        }
        TaskNode tempNode = head;
        while (tempNode != null){
            System.out.println(tempNode.taskName);
            tempNode = tempNode.next;
        }

    }
}
