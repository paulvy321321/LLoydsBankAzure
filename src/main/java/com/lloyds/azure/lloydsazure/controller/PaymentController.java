package com.lloyds.azure.lloydsazure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @GetMapping("lloyds")
    public String HelloWorld(){
       return "Demo for Lloyds";
    }
}