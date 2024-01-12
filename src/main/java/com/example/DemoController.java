package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("path")
    public String getMethodName() {
        return "testing CI/CD using github actions";
    }

}