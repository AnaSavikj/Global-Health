package com.example.demo.web.Controllers.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help")
public class help {

    @GetMapping
    public String help(Model model)
    {
        model.addAttribute("bodyContent","help");
        return "MASTER-PAGE";
    }


}
