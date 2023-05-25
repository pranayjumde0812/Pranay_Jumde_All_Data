package com.javaguides.springboot.controller;

import com.javaguides.springboot.model.Employee;
import com.javaguides.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Display List Of Employee

    @GetMapping("/")
    public String viewHomePage(Model model){

        model.addAttribute("listEmployees",employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("showNewEmployeeForm")
    public  String showNewEmployeeForm(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee",employee);

        return "new employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute ("employee") Employee employee){

        // Save Employee to Database

        employeeService.saveEmployee(employee);
        return "redirect:/";

    }
}
