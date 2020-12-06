package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nastani")
public class Nastani {
    @GetMapping
    public String prikaz()
    {
        return "Nastani";
    }

}
