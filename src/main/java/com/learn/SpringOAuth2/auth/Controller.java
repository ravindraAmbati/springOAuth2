package com.learn.SpringOAuth2.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String test(){
        return "reached to "+this.getClass().getSimpleName();
    }

    @GetMapping("/read")
    public String read(){
        return "only authorized can read this!";
    }
}
