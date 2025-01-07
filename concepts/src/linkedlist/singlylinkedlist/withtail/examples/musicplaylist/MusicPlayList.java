package linkedlist.singlylinkedlist.withtail.examples.musicplaylist;

public class MusicPlayList {
    Node head;
    Node tail;
    public void add(String song){
        Node newSong = new Node(song);
        if (head == null){
            head = newSong;
        }else {
            tail.next = newSong;
        }
        tail =  newSong;
    }
    public void display(){
        Node tempNode = head;
        while (tempNode != null){
            System.out.print(tempNode.song + " --> ");
            tempNode = tempNode.next;
        }
        System.out.print("END");
    }
}
