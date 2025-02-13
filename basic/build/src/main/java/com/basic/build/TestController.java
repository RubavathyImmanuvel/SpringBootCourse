package com.basic.build;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //this file handles the http requests/responses
public class TestController {
    @GetMapping("/test") //handles GET requests
    public String test() {
        return "Hello world!";
    }
}
