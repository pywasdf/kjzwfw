package com.pyw.springmybatis.controller.Api.login;

import com.pyw.springmybatis.Common.JSONResult;
import com.pyw.springmybatis.entity.User;
import com.pyw.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 登录相关的接口
 */

@RestController
@RequestMapping(value="/login/")
public class LoginController {

    @Autowired
    private UserService userService;


    @RequestMapping(value="/doLogin",method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String,Object> user) throws Exception
    {
        JSONResult retJson=null;
       List<User> list= userService.login(user);
       if(list.size()>=1)
       {
           request.getSession().setAttribute("loginUser", list.get(0));
           retJson=JSONResult.success(list.get(0));
       }
       else
       {
           retJson=JSONResult.fail("-1","用户名或密码错误!");
       }


       return retJson.toString();
    }
}
