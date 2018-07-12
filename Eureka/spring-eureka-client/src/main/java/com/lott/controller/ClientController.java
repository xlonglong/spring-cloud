package com.lott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @创建人 xlonglong
 * @创建时间 2018/7/11
 * @描述
 */
@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/hello")
    public String welcome()
    {
        String ret=restTemplate.getForObject("http://springEurekaServer/call/xlonglong",String.class);
        return ret;
    }
}
