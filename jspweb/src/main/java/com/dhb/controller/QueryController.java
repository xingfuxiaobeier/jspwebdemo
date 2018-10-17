package com.dhb.controller;

import com.dhb.biz.QueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mtime on 2018/9/9.
 */
@Controller
@RequestMapping("/")
public class QueryController {

//    static final Logger log = LoggerFactory.getLogger(QueryController.class);
    @Autowired
    private QueryService queryService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "";
    }

    @RequestMapping("welcome")
    String welcom() {
        return "welcome";
    }


    ////////////////////////////////////request////////////////////////////////////
    /*request page login*/
    @RequestMapping("login")
    public String login(){
        // 页面位置 /WEB-INF/jsp/page/page.jsp
//        ModelAndView mav = new ModelAndView("login");
//        mav.addObject("content", hello);
        return "login";
    }

    /*request page login*/
    @RequestMapping("register")
    public String register(){
        return "register";
    }


    ////////////////////////////////////response////////////////////////////////////
    /*response page login*/
    @RequestMapping(value = "loginAction", method = RequestMethod.POST)
    @ResponseBody //（注意：添加该注解表示服务端以数据返回；不添加该注解表示服务端以字符串表示jsp文件进行返回）
    public Map<String, String> loginAction(
            HttpServletRequest request,
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ) {
//        MultipartHttpServletRequest params=(MultipartHttpServletRequest) request;
        String username_res = request.getParameter("username");
        String password_res = request.getParameter("password");
        System.out.println("login action request name1 : " + username + ", pas1 : " + password);
        System.out.println("login action request name_res : " + username_res + ", pas_res : " + password_res);
        Map<String, String> res = new HashMap<>();
        res.put("status", "true");
        return res;
    }

    /*response page register*/
    @RequestMapping(value = "registerAction", method = RequestMethod.POST)
    public String registerAction(
            @RequestBody String requestBody,
            HttpServletRequest request
    ) {
        String username = request.getParameter("username");
        String password = request.getParameter("password1");
        String email = request.getParameter("email");
        System.out.println("login action request name : " + username +
                ", pas : " + password +
                ", email : " + email);
        queryService.saveUserInfo(username, password, email);
        return "welcome";
    }
}
