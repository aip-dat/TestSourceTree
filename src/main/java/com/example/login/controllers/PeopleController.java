package com.example.login.controllers;
import com.example.login.models.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@Controller
@RequestMapping("/people")
public class PeopleController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("people", new People());
        return "peopleform";
    }

    @PostMapping("")
    public String submitForm(@ModelAttribute("people") People people, Model model) {
        // process form data here
        return "peopleform";
    }

}
