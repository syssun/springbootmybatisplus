package com.sys.demo.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("BUSER")
public class Users {
    private String name ;
    @TableId
    private String userid ;

}
