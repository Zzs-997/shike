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

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    @GetMapping("/selectMemberBymemberPhone/{memberPhone}")
    public ResponseResult<Member> selectMemberBymemberPhone(@PathVariable String memberPhone){
        Member member = memberService.selectMemberBymemberPhone(memberPhone);
        return new ResponseResult<>(ResponseResult.CodeStatus.OK,"查询用户",member);
//        使用：http://localhost:9090/member/selectMemberBymemberPhone/13707077461
=======
=======
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
    @GetMapping("/selectMemberByMemberPhone/{memberPhone}")
    public ResponseResult<Member> selectMemberByMemberPhone(@PathVariable String memberPhone){
        Member member = memberService.selectMemberByMemberPhone(memberPhone);
        return new ResponseResult<>(ResponseResult.CodeStatus.OK,"查询用户",member);
//        使用：http://localhost:9090/member/selectMemberByMemberPhone/13707077461
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
    }

    @PostMapping("/createMember")
    public ResponseResult<Void> createMember(@RequestBody MemberVo memberVo){
        memberService.createMember(memberVo);
        return new ResponseResult<>(ResponseResult.CodeStatus.OK_INSERT,"添加会员");
    }
}
