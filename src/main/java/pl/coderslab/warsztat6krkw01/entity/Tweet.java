package pl.coderslab.warsztat6krkw01.entity;

import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.warsztat6krkw01.model.UserDto;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    private String text;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Tweet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "user=" + user +
                ", text='" + text + '\'' +
                ", created=" + created +
                '}';
    }
}
