package com.bootstrapswagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName TestController.java
 * @Description TODO
 * @createTime 2022年01月07日 10:40:00
 */
@RestController
public class TestController {
    @GetMapping("hello")
    public String hello(@RequestParam("id") int id) {
        return "hello" + id;
    }
}
