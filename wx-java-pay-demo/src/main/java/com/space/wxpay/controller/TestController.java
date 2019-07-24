package com.space.wxpay.controller;

import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import com.space.wxpay.config.WxPayProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuzhe
 * @date 2019/7/24 09:25
 * @email zhuzhe_mail@163.com
 */
@RestController
public class TestController {

    @Autowired
    private WxPayService wxService;

    @Autowired
    private WxPayProperties properties;

    @GetMapping("/test")
    public String test() throws WxPayException {

        System.out.println(properties.getAppId());

        wxService.queryOrder("123", "456");
        return "test ok";
    }
}
