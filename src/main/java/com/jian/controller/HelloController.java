package com.jian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World REST Controller for testing the application.
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from JianStarter Spring Boot Application!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running successfully!";
    }

}