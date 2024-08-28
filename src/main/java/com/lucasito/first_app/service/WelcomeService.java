package com.lucasito.first_app.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String message(String name){
        return "Aku Aku Aku " + name;
    }

}

