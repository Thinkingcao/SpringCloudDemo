package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zheng-Xuewei
 * 2017-12-10 20:37
 */
@RestController
public class ServerController {

    @GetMapping("/msgForOrder")
    public String msg() {
        return "this is product' msg";
    }
}

