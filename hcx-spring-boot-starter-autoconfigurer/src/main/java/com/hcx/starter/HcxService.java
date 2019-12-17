package com.hcx.starter;

/**
 * @ClassName HcxService
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2019-12-17 18:39
 * @Version 1.0
 **/
public class HcxService {
    HcxProperties hcxProperties;

    public HcxProperties getHcxProperties(){
        return hcxProperties;
    }

    public void setHcxProperties(HcxProperties hcxProperties){
        this.hcxProperties = hcxProperties;
    }

    public String firstHcxStarter(String name){
        return hcxProperties.getPrefix() + "---->" + name + "---->" + hcxProperties.getSuffix();
    }
}
