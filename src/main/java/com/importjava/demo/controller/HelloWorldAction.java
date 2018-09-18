package com.importjava.demo.controller;

import com.importjava.demo.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/helloWorldAction")
public class HelloWorldAction {

    @Autowired
    private IHelloWorldService helloWorldService;

    @GetMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        return "index";
    }

    @PostMapping("/hello")
    public String hello(@RequestParam("username")String username, HttpServletRequest request){
        helloWorldService.insertUser(username);
        request.setAttribute("username",username);
        return "hello";
    }
}
