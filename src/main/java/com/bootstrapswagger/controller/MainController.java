package com.bootstrapswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName MainController.java
 * @Description TODO
 * @createTime 2022年01月07日 09:19:00
 */

@Controller
@Api(tags = {"test"}, description = "test")
public class MainController {

    @GetMapping("test")
    @ResponseBody
    @ApiOperation(value = "test")
    public String test() {
        return "test";
    }
}
