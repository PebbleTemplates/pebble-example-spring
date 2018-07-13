package com.example.data;

import java.util.Date;

public class User {

  private long id;

  private String firstName;

  private String lastName;

  private Date birthday;

  private String gender;

  private String email;

  public User(long id, String firstName, String lastName, Date birthday, String gender,
      String email) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
    this.gender = gender;
    this.email = email;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getBirthday() {
    return this.birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

}
