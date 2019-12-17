package com.hcx.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName HcxProperties
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2019-12-17 18:39
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = "myStarter.hcx")
public class HcxProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
