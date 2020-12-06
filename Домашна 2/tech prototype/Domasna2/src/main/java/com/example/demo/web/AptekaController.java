package com.example.demo.web;

import com.example.demo.Service.AptekaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.net.http.HttpRequest;

@Controller
@RequestMapping("/home")
public class AptekaController {
    private final AptekaService aptekaService;

    public AptekaController(AptekaService aptekaService) {
        this.aptekaService = aptekaService;
    }


    @GetMapping
    public String addBallonPage(Model model,@RequestParam(required = false) String search,HttpSession session,HttpServletRequest req)
    {
        if(search==null)
        {
            String myIP= req.getLocalAddr();
            System.out.println(myIP);
            session.invalidate();

        return "home";}
        else
        {
            session.setAttribute("koj",search);

            model.addAttribute("apteki",aptekaService.findbyC(search));
            return "SiteApteki";

        }

    }

    @GetMapping("/apteki")
    public String SiteApteki(Model model, @RequestParam(required = false) String search, HttpSession request)
    {
        if(search==null)
        {
            request.invalidate();

            model.addAttribute("apteki",aptekaService.findallPharmacy());

            return "SiteApteki";}
        else
        {
            request.setAttribute("koj",search);

            model.addAttribute("apteki",aptekaService.findbyC(search));
            return "SiteApteki";

        }

    }




}
