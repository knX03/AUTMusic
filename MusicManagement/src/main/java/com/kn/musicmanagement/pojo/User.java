package com.kn.musicmanagement.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private Integer id;
    private String user_ID;
    private String user_Name;
    private String user_Email;
    private String user_Password;
    private String user_Sex;
    private Integer user_Age;
    private String user_Avatar;
    private String user_Birthday;
    private String user_Introduction;

    public User() {
    }

    public User(Integer id, String user_ID, String user_Name, String user_Email, String user_Password, String user_Sex, Integer user_Age, String user_Avatar, String user_Birthday, String user_Introduction) {
        this.id = id;
        this.user_ID = user_ID;
        this.user_Name = user_Name;
        this.user_Email = user_Email;
        this.user_Password = user_Password;
        this.user_Sex = user_Sex;
        this.user_Age = user_Age;
        this.user_Avatar = user_Avatar;
        this.user_Birthday = user_Birthday;
        this.user_Introduction = user_Introduction;
    }

    public User(String user_Name, String user_Email, String user_Password, String user_Sex, Integer user_Age) {
        this.user_Name = user_Name;
        this.user_Email = user_Email;
        this.user_Password = user_Password;
        this.user_Sex = user_Sex;
        this.user_Age = user_Age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_ID='" + user_ID + '\'' +
                ", user_Name='" + user_Name + '\'' +
                ", user_Email='" + user_Email + '\'' +
                ", user_Password='" + user_Password + '\'' +
                ", user_Sex='" + user_Sex + '\'' +
                ", user_Age=" + user_Age +
                ", user_Avatar='" + user_Avatar + '\'' +
                ", user_Birthday='" + user_Birthday + '\'' +
                ", user_Introduction='" + user_Introduction + '\'' +
                '}';
    }
}
