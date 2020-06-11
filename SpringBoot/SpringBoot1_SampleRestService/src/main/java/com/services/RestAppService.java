package com.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAppService {

    @RequestMapping("/")
    public String sample(){
        return "Test Rest Service";
    }
}
