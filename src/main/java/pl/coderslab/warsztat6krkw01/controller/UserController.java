package pl.coderslab.warsztat6krkw01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.warsztat6krkw01.entity.User;
import pl.coderslab.warsztat6krkw01.model.UserDto;
import pl.coderslab.warsztat6krkw01.repository.UserRepository;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String register(Model m){
        m.addAttribute("user", new UserDto());

        return "user/register";
    }

    @PostMapping("/register")
    public String registerPost(@Valid @ModelAttribute("user") UserDto user, BindingResult br){
        if(user.getPassword() != null &&
                !user.getPassword().trim().equals("") &&
                !user.getPassword().equals(user.getRepeatPassword())) {
            br.rejectValue("repeatPassword", "PasswordsDoNotMatch", "Passwords must match");
        }
        if(br.hasErrors()) {
            return "user/register";
        }

        User u = new User(user);

        this.userRepository.save(u);

        return "redirect:login";
    }

    @GetMapping("/login")
    public String login(Model m){
        m.addAttribute("user", new UserDto());

        return "user/login";
    }

    @PostMapping("/login")
    public String registerPost(UserDto loginData, Model m, HttpSession s) {
        User user = this.userRepository.findByEmail(loginData.getEmail());
        if(user==null){
            m.addAttribute("user", loginData);
            m.addAttribute("msg", "User not found");
            return "user/login";
        }

        if(!user.isPasswordCorrect(loginData.getPassword())){
            m.addAttribute("user", loginData);
            m.addAttribute("msg", "Wrong password");
            return "user/login";
        }

        s.setAttribute("loggedInUser", user);

        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession s){
        s.removeAttribute("loggedInUser");

        return "redirect:login";
    }
}
