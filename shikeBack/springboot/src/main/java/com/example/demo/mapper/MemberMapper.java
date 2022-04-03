package com.example.demo.mapper;

import com.example.demo.domain.Member;
import com.example.demo.domain.MemberExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
<<<<<<< HEAD
<<<<<<< HEAD

=======
import org.springframework.stereotype.Repository;

@Repository
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======
import org.springframework.stereotype.Repository;

@Repository
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
@Mapper
public interface MemberMapper {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}