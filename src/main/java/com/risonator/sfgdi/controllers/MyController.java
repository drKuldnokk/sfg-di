package com.risonator.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final double id = Math.random();
    private int timesCalled = 0;

    public String sayHello() {
        System.out.println("This method has been called " + timesCalled + " times.");
        timesCalled++;
        System.out.println("Hello world " + id);
        System.out.println("Hello world " + id);

        return "hello again!";
    }
}
