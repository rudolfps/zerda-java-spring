package com.greenfox.exams.spring.controllers;

import com.greenfox.exams.spring.domain.WelcomeForm;
import com.greenfox.exams.spring.services.WelcomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;
/**
 * Created by gabkamabka on 2017.01.11..
 */
    @Controller
    public class WelcomePageController extends WebMvcConfigurerAdapter {

    private WelcomeService welcomeService;

    @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/thankyou").setViewName("thankyou");
        }

        @GetMapping("/")
        public String showForm(WelcomeForm welcomeForm) {
            return "form";
        }

        @PostMapping("/")
        public String checkUserInfo(@Valid WelcomeForm welcomeForm, BindingResult bindingResult) {

            if (bindingResult.hasErrors()) {
                return "form";
            }
            return "redirect:/thankyou";

        }
    @RequestMapping(value = "/list")
    private String listAll(Model model) {
        model.addAttribute("welcomelist", WelcomeService.list());
        return "list";
    }

    @PostMapping("/new")
    public String addNewPost(@ModelAttribute WelcomeForm welcomeForm){
        welcomeService.save(welcomeForm);
        return "redirect:/thankyou";
    }
 }




