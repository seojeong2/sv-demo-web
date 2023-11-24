package com.ktsv.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@Controller
public class WebController {

   @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goMain(Model model){
       return "index";
   }

   @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String goTest() {
       return "test";
   }


   @RequestMapping(value = "/verification", method = RequestMethod.GET)
    public String goVerification() {
       return "Verification";
   }

   @RequestMapping(value = "/classification", method = RequestMethod.GET)
    public String goClassification() {
       return "Classification";
   }
}
