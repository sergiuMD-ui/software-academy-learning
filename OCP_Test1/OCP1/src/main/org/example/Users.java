package org.example;


public class Users {
    private String userName;
    private int userID;
    private String userEmail;

    public Users(String userName, int userID, String userEmail) {
        this.userName = userName;
        this.userID = userID;
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", userID=" + userID +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
