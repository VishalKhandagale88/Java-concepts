package linkedlist.singlylinkedlist.withouttail.examples.taskmanagement;

public class Main {
    public static void main(String[] args) {
        TasksManager tasksManager = new TasksManager();
        tasksManager.addTask("1. task 1");
        tasksManager.addTask("2. task 2");
        tasksManager.addTask("3. task 3");
        tasksManager.addTask("4. task 4");
        tasksManager.addTask("5. task 5");
        tasksManager.displayAllTasks();
    }
}
