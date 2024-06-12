package com.kn.musicmanagement.pojo;

public class SongPlaylists {
    private Integer id;
    private String playlist_ID;
    private String playlist_Name;
    private String song_ID;
    private String create_By;
    private String create_Time;
    private String playlist_Introduction;

    public SongPlaylists() {
    }

    public SongPlaylists(Integer id, String playlist_ID, String playlist_Name, String song_ID, String create_By, String create_Time, String playlist_Introduction) {
        this.id = id;
        this.playlist_ID = playlist_ID;
        this.playlist_Name = playlist_Name;
        this.song_ID = song_ID;
        this.create_By = create_By;
        this.create_Time = create_Time;
        this.playlist_Introduction = playlist_Introduction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaylist_ID() {
        return playlist_ID;
    }

    public void setPlaylist_ID(String playlist_ID) {
        this.playlist_ID = playlist_ID;
    }

    public String getPlaylist_Name() {
        return playlist_Name;
    }

    public void setPlaylist_Name(String playlist_Name) {
        this.playlist_Name = playlist_Name;
    }

    public String getSong_ID() {
        return song_ID;
    }

    public void setSong_ID(String song_ID) {
        this.song_ID = song_ID;
    }

    public String getCreate_By() {
        return create_By;
    }

    public void setCreate_By(String create_By) {
        this.create_By = create_By;
    }

    public String getCreate_Time() {
        return create_Time;
    }

    public void setCreate_Time(String create_Time) {
        this.create_Time = create_Time;
    }

    public String getPlaylist_Introduction() {
        return playlist_Introduction;
    }

    public void setPlaylist_Introduction(String playlist_Introduction) {
        this.playlist_Introduction = playlist_Introduction;
    }

    @Override
    public String toString() {
        return "songPlaylists{" +
                "id=" + id +
                ", playlist_ID='" + playlist_ID + '\'' +
                ", playlist_Name='" + playlist_Name + '\'' +
                ", song_ID='" + song_ID + '\'' +
                ", create_By='" + create_By + '\'' +
                ", create_Time='" + create_Time + '\'' +
                ", playlist_Introduction='" + playlist_Introduction + '\'' +
                '}';
    }
}
