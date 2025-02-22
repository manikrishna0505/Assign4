package com.wk6.assignment4.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.wk6.assignment4.model.WorkshopRegistration;
import com.wk6.assignment4.repository.WorkshopRegistrationRepo;

import jakarta.validation.Valid;


@Controller
public class WorkshopRegistrationController {

	@Autowired
    private WorkshopRegistrationRepo repository;

    @GetMapping("/")
    public String showForm(WorkshopRegistration workshopRegistration) {
        return "register";
    }

    @PostMapping("/submit")
    public String submitForm(@Valid WorkshopRegistration workshopRegistration, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "register";
        }
        repository.save(workshopRegistration);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String showSuccess() {
        return "success";
    }
}