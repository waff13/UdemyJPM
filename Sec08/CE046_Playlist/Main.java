package CE046_Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Song testSongOne = new Song("OneTitle", 1.11);
        Song testSongTwo = new Song("TwoTitle", 2.22);

        System.out.println(testSongOne.toString());
        System.out.println(testSongTwo);

        ArrayList<Album> albums = new ArrayList<Album>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Hold On", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        album.addSong("Holy Man", 4.3);
        albums.add(album);

        //System.out.println("Album title: " + album.getAlbumTitle());

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playlist);
        albums.get(0).addToPlayList("Holy Man", playlist);
        albums.get(0).addToPlayList("Speed king", playlist); // Does not exist
        albums.get(0).addToPlayList("You can't do it right", playlist); // duplicated entry, fine for now
        albums.get(0).addToPlayList(9, playlist);
        albums.get(0).addToPlayList(3, playlist);
        albums.get(0).addToPlayList(2, playlist);
        albums.get(0).addToPlayList(24, playlist); // There is no track 24
    }
}
