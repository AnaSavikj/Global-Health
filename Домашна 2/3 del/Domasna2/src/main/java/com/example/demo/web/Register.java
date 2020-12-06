package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/register")
public class Register {
    @GetMapping

    public String prikazi(HttpServletRequest request)
    {
        return "Register";
    }
   @PostMapping
    public String registriraj()
    {
        return "redirect:/home";
    }


}
