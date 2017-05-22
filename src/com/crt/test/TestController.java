package com.crt.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    @Resource
    private TestService testService;
    
    public String addPerson(){
        testService.savePerson();
        return "success";
    }
}
