package com.mouli.iplstats.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class GreetingController {
    @GetMapping("greet")
    public ResponseEntity<String> greet(@RequestParam(required = false) String username){
        if(username == null){
            username = "User";
        }
        String message = String.format("Hello %s , welcome to spring boot world!", username);
        return ResponseEntity.ok(message);
    }

}
