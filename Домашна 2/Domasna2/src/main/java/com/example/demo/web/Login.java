package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class Login {

    @GetMapping
    public String prikazi()
    {
        return "Login";
    }

    @PostMapping("/logiranje")
    public String logiraj()
    {

        return "redirect:/home";
    }



}
