package com.kongruksiam.firstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

        @GetMapping("/")
        public String display(){
            return "Hello Spring Boot";
        }

        @GetMapping("/about")
        public String about(){
            return "เกี่ยวกับเรา";
        }

        @GetMapping("/api")
        public String api(){
            return "Test API";
        }
}
