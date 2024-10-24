package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("")
    public String host(){
        return "redirect:/login";
    }
}
