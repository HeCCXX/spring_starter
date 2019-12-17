package com.hcx.startertest.controller;

import com.hcx.starter.HcxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MyStarterController
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2019-12-17 19:24
 * @Version 1.0
 **/
@RestController
public class MyStarterController {

    @Autowired
    HcxService hcxService;

    @GetMapping("/hello")
    public String hello(){
        return hcxService.firstHcxStarter("hcx");
    }
}
