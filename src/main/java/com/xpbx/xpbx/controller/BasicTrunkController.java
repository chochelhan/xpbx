package com.xpbx.xpbx.controller;

import com.xpbx.xpbx.domain.BasicTrunk;
import com.xpbx.xpbx.domain.BasicTrunkPaging;
import com.xpbx.xpbx.service.BasicTrunkService;
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
public class BasicTrunkController {

    @Autowired
    private BasicTrunkService basicTrunkSerivce;

    @Autowired
    private MemberService memberService;

    @ResponseBody
    @PostMapping("/basic/trunkList")
    public HashMap<String, Object> terminalList(HttpServletRequest request, @ModelAttribute BasicTrunkPaging params) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            HashMap<String,Object> dataObject = new HashMap<String,Object>();
            dataObject = basicTrunkSerivce.getDataListByPaging(params);
            map.put("result",dataObject);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }
    @ResponseBody
    @PostMapping("/basic/trunkAllList")
    public HashMap<String, Object> trunkList(HttpServletRequest request) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            List<BasicTrunk> dataList = basicTrunkSerivce.getDataList();
            map.put("result", dataList);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }

    @ResponseBody
    @GetMapping("/basic/insertTrunk")
    public HashMap<String, String> insertTrunk(HttpServletRequest request, @ModelAttribute BasicTrunk params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicTrunkSerivce.insertData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/updateTrunk")
    public HashMap<String, String> updateTrunk(HttpServletRequest request, @ModelAttribute BasicTrunk params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicTrunkSerivce.updateData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/deleteTrunk")
    public HashMap<String, String> deleteTrunk(HttpServletRequest request, @ModelAttribute BasicTrunk params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicTrunkSerivce.deleteData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }
}
