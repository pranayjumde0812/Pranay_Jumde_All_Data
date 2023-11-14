package com.coderview.thymeleaf_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class FragmentsController {

    // handler for including fragments

    @GetMapping("/service")
    public String serviceHandler() {

        return "service";
    }

    @GetMapping("/action")
    public String dynamicValueToFragments(Model model) {

        model.addAttribute("title", "Dynamic Value in fragments");
        model.addAttribute("subtitle", LocalDateTime.now().toString());
        return "action";
    }
}
