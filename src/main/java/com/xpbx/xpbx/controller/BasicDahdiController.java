package com.xpbx.xpbx.controller;

import com.xpbx.xpbx.domain.BasicDahdi;
import com.xpbx.xpbx.domain.BasicDahdiPaging;
import com.xpbx.xpbx.service.BasicDahdiService;
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
public class BasicDahdiController {

    @Autowired
    private BasicDahdiService basicDahdiService;

    @Autowired
    private MemberService memberService;


    @ResponseBody
    @PostMapping("/basic/dahdiList")
    public HashMap<String, Object> dahdiList(HttpServletRequest request, @ModelAttribute BasicDahdiPaging params) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            HashMap<String,Object> dataObject = new HashMap<String,Object>();
            dataObject = basicDahdiService.getDataListByPaging(params);
            map.put("result",dataObject);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }
    @ResponseBody
    @PostMapping("/basic/dahdiAllList")
    public HashMap<String, Object> dahdiAllList(HttpServletRequest request) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            List<BasicDahdi> dataList = basicDahdiService.getDataList();
            map.put("result", dataList);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }

    @ResponseBody
    @GetMapping("/basic/insertDahdi")
    public HashMap<String, String> insertTrunk(HttpServletRequest request, @ModelAttribute BasicDahdi params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicDahdiService.insertData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/updateDahdi")
    public HashMap<String, String> updateDahdi(HttpServletRequest request, @ModelAttribute BasicDahdi params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicDahdiService.updateData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/deleteDahdi")
    public HashMap<String, String> deleteDahdi(HttpServletRequest request, @ModelAttribute BasicDahdi params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicDahdiService.deleteData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }
}
