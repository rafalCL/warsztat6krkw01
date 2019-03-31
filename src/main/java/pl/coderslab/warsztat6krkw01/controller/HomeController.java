package pl.coderslab.warsztat6krkw01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.warsztat6krkw01.entity.Tweet;
import pl.coderslab.warsztat6krkw01.repository.TweetRepository;

import java.util.List;

@Controller
public class HomeController {
    private TweetRepository tweetRepository;

    @Autowired
    public HomeController(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @GetMapping("")
    public String home(Model m) {
        final List<Tweet> tweets = this.tweetRepository.findAll();
        m.addAttribute("tweets", tweets);
        return "home/home";
    }
}
