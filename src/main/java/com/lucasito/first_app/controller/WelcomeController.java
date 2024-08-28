package com.lucasito.first_app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.lucasito.first_app.service.WelcomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("pesadao/")
public class WelcomeController {

    @Autowired
    private WelcomeService WelcomeService;

    public WelcomeController(WelcomeService WelcomeService){
        this.WelcomeService = WelcomeService;
    }

    @RequestMapping("/")
    String message(){
        return this.WelcomeService.message("Pau no Teu cu");
    }
}
