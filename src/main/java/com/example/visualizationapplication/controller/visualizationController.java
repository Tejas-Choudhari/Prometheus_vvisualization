package com.example.visualizationapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visualizationController {

    @GetMapping("/api1")
    public String getString(){
        return "This is actuator API ";
    }
}
