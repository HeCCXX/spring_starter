package com.hcx.startertest.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Component;

/**
 * @ClassName HcxCommandLineRunner
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2019-12-17 19:58
 * @Version 1.0
 **/
@Component
public class HcxCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("HcxCommandLineRunner  run ....");
    }
}
