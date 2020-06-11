package com.xysf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class JumpClass {
    @RequestMapping("/index.action")
    public String getIndex(){
        return "index";
    }
    @RequestMapping("/test.action")
    public String getTest(){
        return "test";
    }
}
