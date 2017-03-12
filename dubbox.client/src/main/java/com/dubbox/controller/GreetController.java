package com.dubbox.controller;

import com.dubbox.base.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by frinder6 on 2017/2/15.
 */
@RestController
@RequestMapping
public class GreetController {

    @Autowired
    private GreetService greetService;

    @RequestMapping("/greet")
    public String greet(String message) {
        greetService.greet(message);
        return "hello Dubbox !";
    }

}
