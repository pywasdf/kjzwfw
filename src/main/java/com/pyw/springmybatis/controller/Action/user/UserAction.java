package com.pyw.springmybatis.controller.Action.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value="/user")
@Controller
public class UserAction {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index(Model model, HttpServletRequest request) {
        model.addAttribute("userInfo", request.getSession().getAttribute("loginUser"));
        return "user/list";
    }
}




