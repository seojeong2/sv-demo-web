package com.ktsv.demoweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/data")
    public String getData() {
        return "success";
    }
}
