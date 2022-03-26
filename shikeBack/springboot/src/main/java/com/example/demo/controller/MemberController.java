package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.entity.ResponseResult;
import com.example.demo.parames.MemberVo;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/selectMemberByMemberPhone/{memberPhone}")
    public ResponseResult<Member> selectMemberByMemberPhone(@PathVariable String memberPhone){
        Member member = memberService.selectMemberByMemberPhone(memberPhone);
        return new ResponseResult<>(ResponseResult.CodeStatus.OK,"查询用户",member);
//        使用：http://localhost:9090/member/selectMemberByMemberPhone/13707077461
    }

    @PostMapping("/createMember")
    public ResponseResult<Void> createMember(@RequestBody MemberVo memberVo){
        memberService.createMember(memberVo);
        return new ResponseResult<>(ResponseResult.CodeStatus.OK_INSERT,"添加会员");
    }
}
