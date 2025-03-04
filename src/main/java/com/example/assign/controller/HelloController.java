package com.example.assign.controller;

import com.example.assign.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

//    @GetMapping("/param/{name}")
//    public String sayHelloWithPath(@PathVariable String name) {
//        return "Hello " + name + " from BridgeLabz";
//    }
@PostMapping("/post")
public String sayHelloWithPost(@RequestBody UserDTO user) {
    return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
}



}
