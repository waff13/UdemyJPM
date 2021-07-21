package CE046_Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album (String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public String getAlbumTitle () {
        return name;
    }

    private Song findSong (String songTitle) {
        // Returns the Song if it exists or null otherwise
        //System.out.println("Size: " + songs.size() + ", title: " + this.getAlbumTitle());

        for (Song song : songs) {
            //System.out.println("Checking vs: " + song.getTitle());
            if (songTitle.equals(song.getTitle())) {
                //System.out.println("Song " + songTitle + " found!");
                return song;
            }
        }
        //System.out.println("Song not found!");
        return null;
    }

    public boolean addSong (String songTitle, double duration) {
        // Returns true if the song was added or false otherwise
        if (findSong(songTitle) == null) {
            this.songs.add(new Song(songTitle, duration));
            System.out.println("Song " + songTitle + " with duration " + duration + " added to the album " + this.getAlbumTitle());
            return true;
        }
        System.out.println("Looks like this song already exists in this album!");
        return false;
    }

    public boolean addToPlaylist (int trackNumber, LinkedList<Song> playlist) {
        // Returns true if the song exists and was added to the list or false otherwise
        if ((trackNumber - 1) <= songs.size()) {
            String songTitle = this.songs.get((trackNumber - 1)).getTitle();
            if (addToPlaylist(songTitle, playlist)) {
                return true;
            };
        }
        return false;
    }

    public boolean addToPlaylist (String songTitle, LinkedList<Song> playlist) {
        // Returns true if the song exists and was added to the list or false otherwise
        if (findSong(songTitle) != null) {
            playlist.add(findSong(songTitle));
            System.out.println("Song " + songTitle + " added to playlist");
            return true;
        }
        return false;
    }
}
