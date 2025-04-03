package com.xpbx.xpbx.controller;

import com.xpbx.xpbx.domain.AddRinggroup;
import com.xpbx.xpbx.domain.AddRinggroupPaging;
import com.xpbx.xpbx.service.AddRinggroupService;
import com.xpbx.xpbx.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
public class AddRinggroupController {

    @Autowired
    private AddRinggroupService addRinggroupSerivce;

    @Autowired
    private MemberService memberService;

    @ResponseBody
    @PostMapping("/add/ringgroupList")
    public HashMap<String, Object> ringgroupList(HttpServletRequest request, @ModelAttribute AddRinggroupPaging params) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            HashMap<String,Object> dataObject = new HashMap<String,Object>();
            dataObject = addRinggroupSerivce.getDataListByPaging(params);
            map.put("result",dataObject);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }
    @ResponseBody
    @PostMapping("/add/ringgroupAllList")
    public HashMap<String, Object> ringgroupAllList(HttpServletRequest request) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            List<AddRinggroup> dataList = addRinggroupSerivce.getDataList();
            map.put("result",dataList);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }
    @ResponseBody
    @GetMapping("/add/insertRinggroup")
    public HashMap<String, String> insertRinggroup(HttpServletRequest request, @ModelAttribute AddRinggroup params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            addRinggroupSerivce.insertData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/add/updateRinggroup")
    public HashMap<String, String> updateRinggroup(HttpServletRequest request, @ModelAttribute AddRinggroup params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            addRinggroupSerivce.updateData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/add/deleteRinggroup")
    public HashMap<String, String> deleteRinggroup(HttpServletRequest request, @ModelAttribute AddRinggroup params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            addRinggroupSerivce.deleteData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }
}
