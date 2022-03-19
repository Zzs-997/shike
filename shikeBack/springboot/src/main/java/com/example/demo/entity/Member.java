package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("member")
@Data
public class Member {
    private String name;
    private String phone;
    private String email;
    private String password;
    private int rank;
}
