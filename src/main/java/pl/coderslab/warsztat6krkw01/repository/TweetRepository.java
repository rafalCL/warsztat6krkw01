package pl.coderslab.warsztat6krkw01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.warsztat6krkw01.entity.Tweet;
import pl.coderslab.warsztat6krkw01.entity.User;

public interface TweetRepository
            extends JpaRepository<Tweet, Long> {

}
