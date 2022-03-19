package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.Member;
import com.example.demo.mapper.MemberMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    MemberMapper memberMapper;

    @PostMapping
    public Result<?> save(@RequestBody Member member) {
        memberMapper.insert(member);
        return Result.success();
    }

}
