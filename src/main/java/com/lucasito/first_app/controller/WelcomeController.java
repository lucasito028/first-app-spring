package com.lucasito.first_app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("pesadao/")
public class WelcomeController {
    @RequestMapping("/")
    String message(){
        return "Chupa Deu certo";
    }
}
