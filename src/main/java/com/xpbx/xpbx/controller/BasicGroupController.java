package com.xpbx.xpbx.controller;
import com.xpbx.xpbx.domain.BasicGroup;
import com.xpbx.xpbx.domain.BasicGroupPaging;
import com.xpbx.xpbx.service.BasicGroupService;
import com.xpbx.xpbx.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
public class BasicGroupController {

    @Autowired
    private BasicGroupService basicGroupSerivce;

    @Autowired
    private MemberService memberService;

    @ResponseBody
    @PostMapping("/basic/groupList")
    public HashMap<String, Object> groupList(HttpServletRequest request, @ModelAttribute BasicGroupPaging params) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            HashMap<String,Object> dataObject = new HashMap<String,Object>();
            dataObject = basicGroupSerivce.getDataListByPaging(params);
            map.put("result",dataObject);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }
    @ResponseBody
    @PostMapping("/basic/groupAllList")
    public HashMap<String, Object> groupAllList(HttpServletRequest request) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            List<BasicGroup> dataList = basicGroupSerivce.getDataList();
            map.put("result",dataList);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }
    @ResponseBody
    @PostMapping("/basic/groupIdCheck")
    public HashMap<String, String> groupIdCheck(HttpServletRequest request,@ModelAttribute BasicGroup params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            String result = basicGroupSerivce.getGroupIdCheck(params);
            map.put("result",result);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }
    @ResponseBody
    @PostMapping("/basic/getGroupInfo")
    public HashMap<String, Object> getGroupInfo(HttpServletRequest request,@ModelAttribute BasicGroup params) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            if(params.getId()!=0) {
                int id = params.getId();
                BasicGroup result = basicGroupSerivce.getGroupInfo(id);
                map.put("result", result);
            } else {
                map.put("result","fail");
            }
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }

    @ResponseBody
    @PostMapping("/basic/insertGroup")
    public HashMap<String, String> insertGroup(HttpServletRequest request, @ModelAttribute BasicGroup params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            String result = basicGroupSerivce.getGroupIdCheck(params);
            if(result.equals("succ")) {
                basicGroupSerivce.insertData(params);
                map.put("result", "succ");
            } else {
                map.put("result", "isGroupId");
            }
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @PostMapping("/basic/updateGroup")
    public HashMap<String, String> updateGroup(HttpServletRequest request, @ModelAttribute BasicGroup params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicGroupSerivce.updateData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @PostMapping("/basic/deleteGroup")
    public HashMap<String, String> deleteGroup(HttpServletRequest request, @ModelAttribute BasicGroup params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicGroupSerivce.deleteData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }
}
