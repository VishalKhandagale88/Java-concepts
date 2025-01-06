package linkedlist.singlylinkedlist.withouttail.examples.musicplaylist;

public class MusicPlaylist {

    private SongNode head;

    public void addSong(String title){
        SongNode newSong = new SongNode(title);
        if (head == null){
            head = newSong;
        }else {
            SongNode tempSong = head;
            while (tempSong.next != null){
                tempSong = tempSong.next;
            }
            tempSong.next =  newSong;
        }
    }
    public void displaySongs(){
        if (head == null){
            System.out.println("Empty playlist");
            return;
        }
        SongNode temSongNode = head;
        while (temSongNode != null){
            System.out.print(temSongNode.title+" -> ");
            temSongNode = temSongNode.next;
        }
        System.out.println("END");
    }
}
