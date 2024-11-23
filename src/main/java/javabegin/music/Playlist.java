package javabegin.music;

import java.util.List;

public class Playlist implements InterfacePlaylist {

    private List<InterfaceSong> songList;

    public Playlist() {
    }

    public Playlist(List<InterfaceSong> songList) {
        this.songList = songList;
    }

    @Override
    public List<InterfaceSong> getSongList() {
        return songList;
    }

    @Override
    public void addSong(InterfaceSong song) {
        songList.add(song);
    }

    @Override
    public void playAllSongs() {
        songList.forEach(InterfaceSong::play);
    }
}