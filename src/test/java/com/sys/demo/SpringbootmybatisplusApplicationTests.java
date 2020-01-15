package com.sys.demo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sys.demo.beans.Users;
import com.sys.demo.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootmybatisplusApplicationTests {
    @Resource
    UserMapper userMapper ;
    @Test
    void contextLoads() {
      // Users u =  userMapper.selectById("1");
        //System.out.println(u.toString());
        System.out.println(userMapper.selectPage(new Page<>(2l,5l),null).toString());
        //System.out.println(userMapper.getListFuze().toString());
    }

}
