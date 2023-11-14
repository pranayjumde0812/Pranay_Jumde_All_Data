package com.coderview.thymeleaf_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class IterationController {

    @GetMapping("/iterate")
    public String getIteration(Model model) {

        List<String> list = Arrays.asList("Pranay", "Aniket", "Mayur", "Rushabh", "Hitanshu", "Prajyot");
        model.addAttribute("nameList", list);

        return "iterate";
    }
}
