package com.example.demo.web;

import com.example.demo.Service.AptekaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/search")
public class search {
    private final AptekaService aptekaService;

    public search(AptekaService aptekaService) {
        this.aptekaService = aptekaService;
    }


    @GetMapping
    public String pokategorija(Model model,HttpServletRequest request)
    {

        model.addAttribute("apteki",aptekaService.findbyC(request.getParameter("searched")));
        return "siteApteki";
    }
}
