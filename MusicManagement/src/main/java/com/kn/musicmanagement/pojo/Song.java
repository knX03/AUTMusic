package com.kn.musicmanagement.pojo;

public class Song {
    private Integer id;
    private String song_ID;
    private String song_Name;
    private String singer_ID;
    private String album_ID;
    private String created_Time;

    public Song() {
    }

    public Song(Integer id, String song_ID, String song_Name, String singer_ID, String album_ID, String created_Time) {
        this.id = id;
        this.song_ID = song_ID;
        this.song_Name = song_Name;
        this.singer_ID = singer_ID;
        this.album_ID = album_ID;
        this.created_Time = created_Time;
    }

    public Song(String song_ID, String song_Name, String singer_ID, String album_ID) {
        this.song_ID = song_ID;
        this.song_Name = song_Name;
        this.singer_ID = singer_ID;
        this.album_ID = album_ID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSong_ID() {
        return song_ID;
    }

    public void setSong_ID(String song_ID) {
        this.song_ID = song_ID;
    }

    public String getSong_Name() {
        return song_Name;
    }

    public void setSong_Name(String song_Name) {
        this.song_Name = song_Name;
    }

    public String getSinger_ID() {
        return singer_ID;
    }

    public void setSinger_ID(String singer_ID) {
        this.singer_ID = singer_ID;
    }

    public String getAlbum_ID() {
        return album_ID;
    }

    public void setAlbum_ID(String album_ID) {
        this.album_ID = album_ID;
    }

    public String getCreated_Time() {
        return created_Time;
    }

    public void setCreated_Time(String created_Time) {
        this.created_Time = created_Time;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", song_ID='" + song_ID + '\'' +
                ", song_Name='" + song_Name + '\'' +
                ", singer_ID='" + singer_ID + '\'' +
                ", album_ID='" + album_ID + '\'' +
                ", created_Time=" + created_Time +
                '}';
    }
}
