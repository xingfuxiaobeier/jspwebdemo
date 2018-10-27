package com.dhb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mtime on 2018/9/10.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/1")
    public String page1(){
        // 页面位置 /WEB-INF/jsp/page/page.jsp
//        ModelAndView mav = new ModelAndView("login");
//        mav.addObject("content", hello);
        return "welcome";
    }
}
