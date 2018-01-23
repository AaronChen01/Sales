package com.sales.controller;


import com.sales.properties.SalesProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by czl
 * 2018-1-3
 */
@RestController
public class HelloController {

    @Autowired
    private SalesProperties salesProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "Hello springboot!  " + salesProperties.getCategory();
    }
}
