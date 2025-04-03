package com.xpbx.xpbx.controller;

import com.xpbx.xpbx.domain.BasicOutbound;
import com.xpbx.xpbx.domain.BasicOutboundPaging;
import com.xpbx.xpbx.service.BasicOutboundService;
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
public class BasicOutboundController {

    @Autowired
    private BasicOutboundService basicOutboundService;

    @Autowired
    private MemberService memberService;


    @ResponseBody
    @PostMapping("/basic/outboundList")
    public HashMap<String, Object> outboundList(HttpServletRequest request, @ModelAttribute BasicOutboundPaging params) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            HashMap<String,Object> dataObject = new HashMap<String,Object>();
            dataObject = basicOutboundService.getDataListByPaging(params);
            map.put("result",dataObject);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }
    @ResponseBody
    @GetMapping("/basic/outboundAllList")
    public HashMap<String, Object> outboundAllList(HttpServletRequest request) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            List<BasicOutbound> dataList = basicOutboundService.getDataList();
            map.put("result", dataList);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }

    @ResponseBody
    @GetMapping("/basic/insertOutbound")
    public HashMap<String, String> insertOutbound(HttpServletRequest request, @ModelAttribute BasicOutbound params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicOutboundService.insertData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/updateOutbound")
    public HashMap<String, String> updateOutbound(HttpServletRequest request, @ModelAttribute BasicOutbound params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicOutboundService.updateData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/deleteOutbound")
    public HashMap<String, String> deleteOutbound(HttpServletRequest request, @ModelAttribute BasicOutbound params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicOutboundService.deleteData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }
}
