package com.coderview.thymeleaf_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InheritingController {

    @GetMapping("/inherit")
    public String inheringContent(Model model) {

        model.addAttribute("title", "This is Inherit Page");
        return "inherit";
    }
}
