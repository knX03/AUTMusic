package com.kn.musicmanagement.pojo;

public class Admin {

    private Integer id;
    private String admin_ID;
    private String admin_Name;
    private String admin_Email;
    private String admin_Password;

    public Admin() {
    }

    public Admin(Integer id, String admin_ID, String admin_Name, String admin_Email, String admin_Password) {
        this.id = id;
        this.admin_ID = admin_ID;
        this.admin_Name = admin_Name;
        this.admin_Email = admin_Email;
        this.admin_Password = admin_Password;
    }

    public Admin(String admin_ID, String admin_Name, String admin_Email, String admin_Password) {
        this.admin_ID = admin_ID;
        this.admin_Name = admin_Name;
        this.admin_Email = admin_Email;
        this.admin_Password = admin_Password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdmin_ID() {
        return admin_ID;
    }

    public void setAdmin_ID(String admin_ID) {
        this.admin_ID = admin_ID;
    }

    public String getAdmin_Name() {
        return admin_Name;
    }

    public void setAdmin_Name(String admin_Name) {
        this.admin_Name = admin_Name;
    }

    public String getAdmin_Email() {
        return admin_Email;
    }

    public void setAdmin_Email(String admin_Email) {
        this.admin_Email = admin_Email;
    }

    public String getAdmin_Password() {
        return admin_Password;
    }

    public void setAdmin_Password(String admin_Password) {
        this.admin_Password = admin_Password;
    }

    @Override
    public String toString() {
        return "admin{" +
                "id=" + id +
                ", admin_ID='" + admin_ID + '\'' +
                ", admin_Name='" + admin_Name + '\'' +
                ", admin_Email='" + admin_Email + '\'' +
                ", admin_Password='" + admin_Password + '\'' +
                '}';
    }
}
