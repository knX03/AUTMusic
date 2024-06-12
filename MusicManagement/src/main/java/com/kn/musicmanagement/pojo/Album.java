package com.kn.musicmanagement.pojo;

public class Album {
    private Integer id;
    private String album_ID;
    private String album_Name;
    private String singer_ID;
    private String song_ID;
    private String create_Time;
    private String album_Introduction;
    private String album_Cover;

    public Album() {
    }

    public Album(Integer id, String album_ID, String album_Name, String singer_ID, String song_ID, String create_Time, String album_Introduction) {
        this.id = id;
        this.album_ID = album_ID;
        this.album_Name = album_Name;
        this.singer_ID = singer_ID;
        this.song_ID = song_ID;
        this.create_Time = create_Time;
        this.album_Introduction = album_Introduction;
    }

    public Album(String album_ID, String album_Name, String singer_ID, String song_ID, String album_Introduction) {
        this.album_ID = album_ID;
        this.album_Name = album_Name;
        this.singer_ID = singer_ID;
        this.song_ID = song_ID;
        this.album_Introduction = album_Introduction;
    }

    public Album(Integer id, String album_ID, String album_Name, String singer_ID, String song_ID, String create_Time, String album_Introduction, String album_Cover) {
        this.id = id;
        this.album_ID = album_ID;
        this.album_Name = album_Name;
        this.singer_ID = singer_ID;
        this.song_ID = song_ID;
        this.create_Time = create_Time;
        this.album_Introduction = album_Introduction;
        this.album_Cover = album_Cover;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlbum_ID() {
        return album_ID;
    }

    public void setAlbum_ID(String album_ID) {
        this.album_ID = album_ID;
    }

    public String getAlbum_Name() {
        return album_Name;
    }

    public void setAlbum_Name(String album_Name) {
        this.album_Name = album_Name;
    }

    public String getSinger_ID() {
        return singer_ID;
    }

    public void setSinger_ID(String singer_ID) {
        this.singer_ID = singer_ID;
    }

    public String getSong_ID() {
        return song_ID;
    }

    public void setSong_ID(String song_ID) {
        this.song_ID = song_ID;
    }

    public String getCreate_Time() {
        return create_Time;
    }

    public void setCreate_Time(String create_Time) {
        this.create_Time = create_Time;
    }

    public String getAlbum_Introduction() {
        return album_Introduction;
    }

    public void setAlbum_Introduction(String album_Introduction) {
        this.album_Introduction = album_Introduction;
    }

    public String getAlbum_Cover() {
        return album_Cover;
    }

    public void setAlbum_Cover(String album_Cover) {
        this.album_Cover = album_Cover;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", album_ID='" + album_ID + '\'' +
                ", album_Name='" + album_Name + '\'' +
                ", singer_ID='" + singer_ID + '\'' +
                ", song_ID='" + song_ID + '\'' +
                ", create_Time='" + create_Time + '\'' +
                ", album_Introduction='" + album_Introduction + '\'' +
                ", album_Cover='" + album_Cover + '\'' +
                '}';
    }
}
