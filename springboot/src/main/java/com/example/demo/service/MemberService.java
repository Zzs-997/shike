package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.parames.MemberVo;

public interface MemberService {
    Member selectMemberBymemberPhone(String memberPhone);
    void createMember(MemberVo memberVo);
}
