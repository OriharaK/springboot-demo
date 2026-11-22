package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/hello2")
    public Map<String, String> hello2(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "John");
        hashMap.put("age", "30");
        return hashMap;
    }
}
