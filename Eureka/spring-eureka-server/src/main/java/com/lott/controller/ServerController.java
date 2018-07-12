package com.lott.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 xlonglong
 * @创建时间 2018/7/11
 * @描述
 */
@RestController
public class ServerController {

    @RequestMapping(value="/call/{name}")
    public String call(@PathVariable("name") String name)
    {
        return "Hello "+name;
    }
}
