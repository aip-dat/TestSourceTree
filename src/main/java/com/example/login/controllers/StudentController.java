package com.example.login.controllers;

import com.example.login.models.Student;
import com.example.login.models.User;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/student")
public class StudentController {

    private static final ArrayList<Student> students = new ArrayList<>();
    @RequestMapping("edit")
    public String edit(ModelMap model){
        Student sv = new Student("Trinh Du Dat - 1911066040", 9.5,"WEB CNPM");
        model.addAttribute("student",sv);
        return "student";
    }

    @ModelAttribute("majors")
    public String[] getMajors(){
        String[] majors = {
                "Ung dung phan mem",
                "Thiet ke trang web",
        };
        return majors;
    }

    @PostMapping("/update")
    public String Update(@ModelAttribute("student") Student student, Model model) {
        if (student.getName().isEmpty() || student.getMajor().isEmpty())
        {
            model.addAttribute("error", "Name and major are required");
            return "student";
        }
        students.add(student);
        model.addAttribute("success", "Update successful");
        return "student";
    }
}
