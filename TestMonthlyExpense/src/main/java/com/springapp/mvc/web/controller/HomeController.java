package com.springapp.mvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping
    public String getHomePage() {
        System.out.println("***** Home *****");
        return "welcomeHome";
    }

}