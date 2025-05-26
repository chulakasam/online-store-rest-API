package com.ceyentra.online_store_REST_API.controller;

import com.ceyentra.online_store_REST_API.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @RequestMapping("/hello")
    public Message sayHello() {
        return new Message("Hello World");
    }
}
