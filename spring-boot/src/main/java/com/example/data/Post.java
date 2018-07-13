package com.example.data;

import java.util.Date;

public class Post {

  private long userId;

  private String userName;

  private Date date;

  private String details;

  private int likes;

  public long getUserId() {
    return this.userId;
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
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getDetails() {
    return this.details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public int getLikes() {
    return this.likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

}
