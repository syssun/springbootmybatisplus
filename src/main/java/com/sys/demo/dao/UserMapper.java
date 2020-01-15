package com.sys.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sys.demo.beans.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper extends BaseMapper<Users> {
    List<Map<String,Object>> getListFuze();
}
