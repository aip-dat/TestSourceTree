package com.example.login.controllers;

import com.example.login.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class LoginController {
    private static final ArrayList<User> users = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        //model.addAttribute("user", new User());
        return "peopleform";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model) {
        for (User value : users) {
            if (value.getUsername().equals(user.getUsername()) && value.getPassword().equals(user.getPassword())) {
                model.addAttribute("success", "Login successful");
                return "index";
            }
        }
        model.addAttribute("error", "Invalid username or password");
        return "index";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("user") User user, Model model) {
        if (user.getUsername().isEmpty() || user.getPassword().isEmpty())
        {
            model.addAttribute("error", "Username and password are required");
            return "index";
        }
        users.add(user);
        model.addAttribute("success", "Registration successful");
        return "index";
    }
}
