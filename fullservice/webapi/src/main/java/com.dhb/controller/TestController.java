package com.dhb.controller;

import com.dhb.biz.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mtime on 2018/9/10.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService service;
    @RequestMapping("/1")
    public String page1(){
        // 页面位置 /WEB-INF/jsp/page/page.jsp
//        ModelAndView mav = new ModelAndView("login");
//        mav.addObject("content", hello);

        service.testService();
        return "welcome";
    }
}
