package com.coderview.thymeleaf_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {

        System.out.println("Inside about handler");

        model.addAttribute("name", "Pranay");
        return "about";
    }
}
