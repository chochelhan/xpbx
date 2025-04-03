package com.xpbx.xpbx.service;

import com.xpbx.xpbx.domain.Member;
import com.xpbx.xpbx.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;


@Service
@Transactional
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public HashMap<String, String> getMemberLogin(Member params) {

        HashMap<String, String> map = new HashMap<String, String>();
        Member memberInfo = memberMapper.selectMemberInfoByLogin(params);
        map.put("result","fail");
        if (memberInfo != null) {
            if(!StringUtils.isEmpty(memberInfo.getUserId())) {
                map.put("result","succ");
                map.put("name",memberInfo.getUserName());
            }
        }
        return map;
    }

    public String getSessionCheck(HttpServletRequest request) {

        HttpSession httpSession = request.getSession(true);
        String userId =(String)httpSession.getAttribute("userId");
        String result = "fail";
        if(!StringUtils.isEmpty(userId)) {
            Member member = memberMapper.selectMemberInfoByUserId(userId);
            if(member != null) {
                result = "succ";
            }
        }
        result = "succ";
        return result;
    }
}
