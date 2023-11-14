package com.coderview.thymeleaf_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ConditionalController {


    // Handler for conditional statements

    @GetMapping("/condition")
    public String conditionalHandler(Model model) {
        System.out.println("Conditional Handler Started");

        model.addAttribute("isActive", false);

        model.addAttribute("gender", "F");

        List<Integer> integers = List.of(233, 55, 777, 987, 1, 7);

        model.addAttribute("listOfNum", integers);
        return "condition";
    }
}
