package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class FirstProj {
    @GetMapping({"/","/movie"})
    public String movie(@RequestParam(value = "name",
    defaultValue = "Spectre") String name, Model
    model) { model.addAttribute("name",name);
    return "movie";


    }
}
