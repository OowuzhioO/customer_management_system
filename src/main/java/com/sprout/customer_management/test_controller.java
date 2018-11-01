package com.sprout.customer_management;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class test_controller {

    @GetMapping
    @ResponseBody
    public void sayHi(){
        System.out.println("hi, bro");
    }
}
