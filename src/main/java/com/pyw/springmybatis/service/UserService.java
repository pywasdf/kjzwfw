package com.pyw.springmybatis.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pyw.springmybatis.entity.User;
import com.pyw.springmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
    public List<User> getList(Map<String,Object> condition){
        return userMapper.getList(condition);
    }
    public List<User> login(Map<String,Object> condition){
        return userMapper.login(condition);
    }
    public PageInfo<User> selectPage(Map<String,Object> condition){
        int pageNum = Integer.parseInt(condition.get("pageNum").toString());
        int pageSize = Integer.parseInt(condition.get("pageSize").toString());
        PageHelper.startPage(pageNum, pageSize);
        List<User> sysMenus = userMapper.selectPage(condition);
        return new PageInfo<User>(sysMenus);
    }
}
