package com.pyw.springmybatis.mapper;


import com.pyw.springmybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {
    User Sel(int id);
    List<User> getList(Map<String,Object> condition);
    List<User> login(Map<String,Object> condition);
    /**
     * 分页查询用户
     * @return
     */
    List<User> selectPage(Map<String,Object> condition);

}
