package com.example.demo.service.impl;


import com.example.demo.domain.Member;
import com.example.demo.domain.MemberExample;
import com.example.demo.mapper.MemberMapper;
import com.example.demo.parames.MemberVo;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Member selectMemberByMemberPhone(String memberPhone){
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria()
                .andPhoneEqualTo(memberPhone);
        List<Member> member = memberMapper.selectByExample(memberExample);

        return member.get(0);
    }

    @Override
    public void createMember(MemberVo memberVo){
        Member member =  new Member();
        member.setName(memberVo.getName());
        member.setPhone(memberVo.getPhone());
        member.setEmail(memberVo.getEmail());
        member.setPassword(memberVo.getPassword());
        member.setRank(memberVo.getRank());

        memberMapper.insert((member));
    }
}
