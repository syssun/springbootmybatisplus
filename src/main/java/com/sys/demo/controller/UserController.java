package com.sys.demo.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sys.demo.beans.Users;
import com.sys.demo.dao.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
@RestController
public class UserController {
    @Resource
    UserMapper userMapper ;
    @GetMapping("/test")
    public Object contextLoads() {
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>() ;
        queryWrapper.select("name");
        queryWrapper.isNotNull("ename").lt("age","10");
        return userMapper.selectPage(new Page<>(1,2),queryWrapper);
    }
}
