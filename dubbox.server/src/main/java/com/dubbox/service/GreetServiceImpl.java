package com.dubbox.service;

import com.dubbox.base.GreetService;
import org.springframework.stereotype.Service;

/**
 * Created by frinder6 on 2017/2/15.
 */
@Service("greetService")
public class GreetServiceImpl implements GreetService {

    @Override
    public void greet(String message) {
        System.out.println("****************************");
        System.out.println("Hello Dobbox !");
        System.out.println("****************************");
    }

}
