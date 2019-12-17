package com.hcx.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName HcxServiceAutoConfiguration
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2019-12-17 18:39
 * @Version 1.0
 **/
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HcxProperties.class)
public class HcxServiceAutoConfiguration {
    @Autowired
    HcxProperties hcxProperties;

    @Bean
    public HcxService hcxService(){
        HcxService service = new HcxService();
        service.setHcxProperties(hcxProperties);
        return service;
    }
}
