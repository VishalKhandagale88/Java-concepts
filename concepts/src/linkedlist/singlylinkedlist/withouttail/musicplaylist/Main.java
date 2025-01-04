package linkedlist.singlylinkedlist.withouttail.musicplaylist;

public class Main {

    public static void main(String[] args) {
        MusicPlaylist musicPlaylist = new MusicPlaylist();
        musicPlaylist.addSong("song 1");
        musicPlaylist.addSong("song 2");
        musicPlaylist.addSong("song 3");
        musicPlaylist.addSong("song 4");
        musicPlaylist.addSong("song 5");
        musicPlaylist.displaySongs();
    }
}
