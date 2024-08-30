package com.lucasito.first_app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.lucasito.first_app.domain.User;
import com.lucasito.first_app.service.WelcomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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
        return this.WelcomeService.message("Pao e Carne");
    }

    @PostMapping("/{id}")
    String helloworldpost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "none") String filter, @RequestBody User body){
        return "Salve " + body.getName() + " " + id + " "+ filter; 
    }

}
