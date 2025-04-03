package com.xpbx.xpbx.controller;

import com.xpbx.xpbx.domain.Member;
import com.xpbx.xpbx.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class MemberController {


    @Autowired
    private MemberService memberSerivce;


    @ResponseBody
    @PostMapping("/member/memberLogin")
    public HashMap<String, Object> memberLogin(HttpServletRequest request, @ModelAttribute Member params) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        HashMap<String,String> result = memberSerivce.getMemberLogin(params);
        String resultCode = "fail";
        if(result.get("result").equals("succ")) {
            HttpSession httpSession = request.getSession(true);
            httpSession.setAttribute("userId", params.getUserId());
            map.put("name",result.get("name"));
            resultCode = "succ";
        }
        map.put("result",resultCode);
        return map;
    }

    /*
    @ResponseBody
    @GetMapping("/basic/insertGroup")
    public HashMap<String, String> insertGroup(@ModelAttribute BasicGroup params) throws Exception {
        //@RequestHeader(value = "memberkey") String memberkey,
        HashMap<String, String> map = new HashMap<String, String>();
        //MemberVo memberInfo = memberService.checkMemberkey(memberkey);
        //if (memberInfo.getUid() != "") {
        basicGroupSerivce.insertData(params);
        map.put("result", "succ");
        //} else {
        //  map.put("result", "notlogin");
        //}
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/updateGroup")
    public HashMap<String, String> updateGroup(@ModelAttribute BasicGroup params) throws Exception {
        //@RequestHeader(value = "memberkey") String memberkey,
        HashMap<String, String> map = new HashMap<String, String>();
        //MemberVo memberInfo = memberService.checkMemberkey(memberkey);
        //if (memberInfo.getUid() != "") {
        basicGroupSerivce.updateData(params);
        map.put("result", "succ");
        //} else {
        //  map.put("result", "notlogin");
        //}
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/deleteGroup")
    public HashMap<String, String> deleteGroup(@ModelAttribute BasicGroup params) throws Exception {
        //@RequestHeader(value = "memberkey") String memberkey,
        HashMap<String, String> map = new HashMap<String, String>();
        //MemberVo memberInfo = memberService.checkMemberkey(memberkey);
        //if (memberInfo.getUid() != "") {
        basicGroupSerivce.deleteData(params);
        map.put("result", "succ");
        //} else {
        //  map.put("result", "notlogin");
        //}
        return map;
    }
*/
}
