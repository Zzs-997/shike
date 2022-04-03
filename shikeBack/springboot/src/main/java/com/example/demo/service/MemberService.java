package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.parames.MemberVo;

public interface MemberService {
<<<<<<< HEAD
<<<<<<< HEAD
    Member selectMemberBymemberPhone(String memberPhone);
=======
    Member selectMemberByMemberPhone(String memberPhone);
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======
    Member selectMemberByMemberPhone(String memberPhone);
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f

    void createMember(MemberVo memberVo);
}
