package com.hcx.startertest.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName HcxApplicationContextInitializer
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2019-12-17 19:58
 * @Version 1.0
 **/
public class HcxApplicationContextInitializer  implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("HcxApplicationContextInitializer............." + applicationContext);
    }
}
