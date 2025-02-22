package com.wipro.RestAPI.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @GetMapping("/home")
    public String home(){
        return "Hello World";
    }
}
