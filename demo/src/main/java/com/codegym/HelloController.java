package com.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("world/hello")
    public String hello(){
        return "hello";
    }

}
