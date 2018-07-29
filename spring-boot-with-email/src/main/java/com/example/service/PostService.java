package com.example.service;

import com.example.data.Post;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private static List<Post> posts = new ArrayList<>();

  static {
    posts.add(
        new Post(1, "Katniss Everdeen", new Date(), 2,
            "Ugh. I'm so hungry. Does anyone want to play a game?"));
    posts.add(new Post(2, "Tyrion Lannister", new Date(), 0,
        "Is it okay to hate your family? Like are you serious nephew? Seriously serious?"));
    posts.add(new Post(3, "Hank Schrader", new Date(), 0,
        "Hey does anyone on here know a W.W? I'm working on a case."));
    posts.add(new Post(4, "Steve Holt", null, 45, "STEVE HOLT"));
    posts.add(new Post(5, "Rick O'Connell", new Date(), 1,
        "IT LOOKS TO ME LIKE YOU'RE ON THE WRONG SIDE OF THE RIVER"));
    posts.add(new Post(6, "Samwise Gamgee", null, 7,
        "Welp. I don't think I'm going to be home for awhile."));
    posts.add(new Post(7, "Elaine Benes", new Date(), 3,
        "You're through, Soup Nazi. Pack it up. No more soup for you. Next!"));
    posts.add(
        new Post(8, "Kenny Powers", new Date(), -1,
            "Anyone want a kid? I'm done with this. F*** this noise."));
  }

  public List<Post> getPosts() {
    return posts;
  }

}
