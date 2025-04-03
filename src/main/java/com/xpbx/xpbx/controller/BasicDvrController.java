package com.xpbx.xpbx.controller;

import com.xpbx.xpbx.domain.BasicDvr;
import com.xpbx.xpbx.domain.BasicDvrPaging;
import com.xpbx.xpbx.service.BasicDvrService;
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
public class BasicDvrController {

    @Autowired
    private BasicDvrService basicDvrSerivce;

    @Autowired
    private MemberService memberService;


    @ResponseBody
    @PostMapping("/basic/dvrList")
    public HashMap<String, Object> dvrList(HttpServletRequest request, @ModelAttribute BasicDvrPaging params) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            HashMap<String,Object> dataObject = new HashMap<String,Object>();
            dataObject = basicDvrSerivce.getDataListByPaging(params);
            map.put("result",dataObject);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }

    @ResponseBody
    @GetMapping("/basic/dvrAllList")
    public HashMap<String, Object> dvrAllList(HttpServletRequest request) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            List<BasicDvr> dataList = basicDvrSerivce.getDataList();
            map.put("result", dataList);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }

    @ResponseBody
    @GetMapping("/basic/insertDvr")
    public HashMap<String, String> insertDvr(HttpServletRequest request, @ModelAttribute BasicDvr params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicDvrSerivce.insertData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/updateDvr")
    public HashMap<String, String> updateDvr(HttpServletRequest request, @ModelAttribute BasicDvr params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicDvrSerivce.updateData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/deleteDvr")
    public HashMap<String, String> deleteDvr(HttpServletRequest request, @ModelAttribute BasicDvr params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicDvrSerivce.deleteData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }
}
