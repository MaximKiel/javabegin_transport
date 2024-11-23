package javabegin.music;

import java.util.List;

public interface InterfacePlaylist {

    List<InterfaceSong> getSongList();
    void addSong(InterfaceSong song);
    void playAllSongs();

}