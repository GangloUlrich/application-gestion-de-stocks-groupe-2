package com.example.gstocks.Models;

public class User {

    private String nameUser;
    private String emailUser;
    private String passUser;
    private String gradeUser;

    public User(String nameUser, String emailUser, String passUser, String gradeUser) {
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.passUser = passUser;
        this.gradeUser = gradeUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassUser() {
        return passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    public String getGradeUser() {
        return gradeUser;
    }

    public void setGradeUser(String gradeUser) {
        this.gradeUser = gradeUser;
    }
}
