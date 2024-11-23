package javabegin;

import javabegin.music.Author;
import javabegin.music.InterfacePlaylist;
import javabegin.music.Playlist;
import javabegin.music.Song;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        InterfacePlaylist playlist = new Playlist(new ArrayList<>());
        playlist.addSong(new Song("Щелкунчик", new Author("Чайковский")));
        playlist.addSong(new Song("Лебединое озеро", new Author("Чайковский")));
        playlist.addSong(new Song("Времена года", new Author("Вивальди")));
        playlist.addSong(new Song("Shape of My Heart", new Author("Sting")));
        playlist.addSong(new Song("Show must go on", new Author("Queen")));
        playlist.addSong(new Song("We will rock you", new Author("Queen")));

        playlist.playAllSongs();
    }
}