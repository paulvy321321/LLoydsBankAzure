package com.lloyds.azure.lloydsazure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paymentPublishController {
    @GetMapping("hello-world")
    public String HelloWorld(){
       return "Yes I am in";
    }
}