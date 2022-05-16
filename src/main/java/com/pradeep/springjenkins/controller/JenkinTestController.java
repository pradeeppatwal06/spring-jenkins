package com.pradeep.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkin")
public class JenkinTestController {

    @GetMapping("/get")
    public String get() {
        return "Hello Java";
    }
}
