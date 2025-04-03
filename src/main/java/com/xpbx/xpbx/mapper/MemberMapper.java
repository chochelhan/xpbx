package com.xpbx.xpbx.mapper;


import com.xpbx.xpbx.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MemberMapper {

    Member selectMemberInfoByUserId(String userId);
    Member selectMemberInfoByLogin(Member params);
    //void updateData(Member params);
}
