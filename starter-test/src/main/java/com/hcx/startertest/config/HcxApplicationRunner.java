package com.hcx.startertest.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName HcxApplicationRunner
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2019-12-17 19:58
 * @Version 1.0
 **/
@Component
public class HcxApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("HcxApplicationRunner  .........  Run");
    }
}
