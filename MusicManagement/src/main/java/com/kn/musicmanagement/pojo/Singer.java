package com.kn.musicmanagement.pojo;

public class Singer {
    private Integer id;
    private String singer_ID;
    private String singer_Name;
    private Integer singer_Age;
    private String singer_Sex;
    private String singer_Introduction;
    private String singer_Album;
    private String singer_Avatar;

    public Singer() {
    }

    public Singer(Integer id, String singer_ID, String singer_Name, Integer singer_Age, String singer_Sex, String singer_Introduction, String singer_Album, String singer_Avatar) {
        this.id = id;
        this.singer_ID = singer_ID;
        this.singer_Name = singer_Name;
        this.singer_Age = singer_Age;
        this.singer_Sex = singer_Sex;
        this.singer_Introduction = singer_Introduction;
        this.singer_Album = singer_Album;
        this.singer_Avatar = singer_Avatar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSinger_ID() {
        return singer_ID;
    }

    public void setSinger_ID(String singer_ID) {
        this.singer_ID = singer_ID;
    }

    public String getSinger_Name() {
        return singer_Name;
    }

    public void setSinger_Name(String singer_Name) {
        this.singer_Name = singer_Name;
    }

    public Integer getSinger_Age() {
        return singer_Age;
    }

    public void setSinger_Age(Integer singer_Age) {
        this.singer_Age = singer_Age;
    }

    public String getSinger_Sex() {
        return singer_Sex;
    }

    public void setSinger_Sex(String singer_Sex) {
        this.singer_Sex = singer_Sex;
    }

    public String getSinger_Introduction() {
        return singer_Introduction;
    }

    public void setSinger_Introduction(String singer_Introduction) {
        this.singer_Introduction = singer_Introduction;
    }

    public String getSinger_Album() {
        return singer_Album;
    }

    public void setSinger_Album(String singer_Album) {
        this.singer_Album = singer_Album;
    }

    public String getSinger_Avatar() {
        return singer_Avatar;
    }

    public void setSinger_Avatar(String singer_Avatar) {
        this.singer_Avatar = singer_Avatar;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", singer_ID='" + singer_ID + '\'' +
                ", singer_Name='" + singer_Name + '\'' +
                ", singer_Age=" + singer_Age +
                ", singer_Sex=" + singer_Sex +
                ", singer_Introduction='" + singer_Introduction + '\'' +
                ", singer_Album='" + singer_Album + '\'' +
                ", singer_Avatar='" + singer_Avatar + '\'' +
                '}';
    }
}
