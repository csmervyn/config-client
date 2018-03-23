package com.mervyn.business.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexinxin
 * @Date: 2018/3/23
 * @Time: 16:54
 * @Description: config-client测试，测试其config client可以从config server读取config repo的配置信息
 */
@RestController
public class HelloController {
    @Value("${from}")
    private String from;
    @Value("${content}")
    private String content;
    @RequestMapping("from")
    public String getFrom() {
        return from;
    }
    @RequestMapping("content")
    public String getContent(){
        return content;
    }

}
