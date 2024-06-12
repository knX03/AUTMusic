package com.kn.musicmanagement.pojo;

public class SongComment {
    private Integer id;
    private String song_ID;
    private String comment;
    private String creator;
    private String postingTime;

    public SongComment() {
    }

    public SongComment(Integer id, String song_ID, String comment, String creator, String postingTime) {
        this.id = id;
        this.song_ID = song_ID;
        this.comment = comment;
        this.creator = creator;
        this.postingTime = postingTime;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getPostingTime() {
        return postingTime;
    }

    public void setPostingTime(String postingTime) {
        this.postingTime = postingTime;
    }

    @Override
    public String toString() {
        return "songComment{" +
                "id=" + id +
                ", song_ID='" + song_ID + '\'' +
                ", comment='" + comment + '\'' +
                ", creator='" + creator + '\'' +
                ", postingTime=" + postingTime +
                '}';
    }
}
