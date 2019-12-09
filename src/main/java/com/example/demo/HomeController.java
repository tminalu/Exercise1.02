package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.AttributedString;

@Controller
public class HomeController {
    private Object Model2;

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar","Say hello to the people.");
        model.addAttribute("myvar2", "Second Variable.");
        return "hometemplate";

    }
    }


