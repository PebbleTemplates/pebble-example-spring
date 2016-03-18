package com.example.data;

import java.util.Date;

public class Post {

    private long userId;

    private String userName;

    private Date date;

    private String details;

    private int likes;

    public long getUserId() {
        return userId;
    }

    public Post(long userId, String userName, Date date, int likes, String details) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.date = date;
        this.likes = likes;
        this.details = details;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

}
