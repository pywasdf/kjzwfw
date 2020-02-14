package com.pyw.springmybatis.controller.Api.user;

import com.alibaba.fastjson.JSON;
import com.pyw.springmybatis.Common.JSONResult;
import com.pyw.springmybatis.entity.User;
import com.pyw.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户相关的接口
 */


@RequestMapping("/user/")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(HttpServletRequest request, @PathVariable int id){
        JSONResult retJson=null;
        User user=userService.Sel(id);
        if(user!=null)
        {
            retJson=JSONResult.success(user);
        }
        else
        {
            retJson=JSONResult.fail("-1","数据错误!");
        }
        return retJson.toString();
    }
    @RequestMapping("/list")
    public String getList(@RequestBody Map<String,Object> condition){
        return JSON.toJSONString(userService.selectPage(condition));
    }
}
