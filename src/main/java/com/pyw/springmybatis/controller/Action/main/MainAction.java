package com.pyw.springmybatis.controller.Action.main;

import com.pyw.springmybatis.entity.User;
import com.pyw.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value="/")
@Controller
public class MainAction {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(Model model,HttpServletRequest request)
    {
        User user=(User)request.getSession().getAttribute("loginUser");
        model.addAttribute("userName",user.getUserName());
        return "index";
    }

    @RequestMapping(value="/main",method = RequestMethod.GET)
    public String main(Model model,HttpServletRequest request)
    {
        model.addAttribute("userInfo",request.getSession().getAttribute("loginUser"));
        return "main";
    }
}
