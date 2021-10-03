package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpring {

    @RequestMapping("/hello")
    public String sayHello(ModelMap map) {
        map.addAttribute("msg", "attributeValue");
        return "index3";
    }
}
