package linkedlist.singlylinkedlist.withouttail.taincoach;

public class TrainCoaches {
    TrainCoachNode trainCoachNodeHead;
    void addTrainCoach(int data){
        TrainCoachNode newCouch = new TrainCoachNode(data);
        newCouch.next = trainCoachNodeHead;
        trainCoachNodeHead = newCouch;
    }
    void display(){
        TrainCoachNode trainCoachTempNode = trainCoachNodeHead;
        if (trainCoachTempNode == null) return;
        while (trainCoachTempNode != null){
            System.out.println(trainCoachTempNode.coachNumber+" --> ");
            trainCoachTempNode = trainCoachTempNode.next;
        }

    }
}
