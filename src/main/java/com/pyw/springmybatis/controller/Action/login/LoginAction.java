package com.pyw.springmybatis.controller.Action.login;

import com.pyw.springmybatis.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="/")
public class LoginAction {

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String login()
    {
        return "login";
    }
    @RequestMapping(value="/nologin",method = RequestMethod.GET)
    public String nologin(HttpServletRequest request)
    {
        request.getSession().removeAttribute("loginUser");
        return "/";
    }
}

