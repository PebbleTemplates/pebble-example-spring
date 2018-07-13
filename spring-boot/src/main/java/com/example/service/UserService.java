package com.example.service;

import com.example.data.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private static List<User> users = new ArrayList<>();

  static {
    users.add(new User(1, "Katniss", "Everdeen", new Date(), "Female", "keverdeen@gmail.com"));
    users.add(new User(2, "Tyrion", "Lannister", new Date(), "Male", "lann_the_man@gmail.com"));
    users.add(new User(3, "Hank", "Schrader", new Date(), "Male", "minerals@marie.com"));
    users.add(new User(4, "Steve", "Holt", null, "Male", "steve@holt.com"));
    users.add(new User(5, "Rick", "O'Connell", new Date(), "Male", "themummy@gmail.com"));
    users.add(new User(6, "Samwise", "Gamgee", null, "Male", "sammie_3@gmail.com"));
    users.add(new User(7, "Elaine", "Benes", new Date(), "Female", "e_ben@hotmail.com"));
    users.add(new User(8, "Kenny", "Powers", new Date(), "Male", "f_this_noise@aol.com"));
  }

  public List<User> getUsers() {
    return users;
  }

  public User getUser(long id) {
    User result = null;
    for (User user : users) {
      if (user.getId() == id) {
        result = user;
        break;
      }
    }
    return result;
  }

}
