package com.xpbx.xpbx.controller;

import com.xpbx.xpbx.domain.BasicTerminal;
import com.xpbx.xpbx.domain.BasicTerminalPaging;
import com.xpbx.xpbx.service.BasicTerminalService;
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
public class BasicTerminalController {

    @Autowired
    private BasicTerminalService basicTerminalSerivce;

    @Autowired
    private MemberService memberService;

    @ResponseBody
    @PostMapping("/basic/terminalList")
    public HashMap<String, Object> terminalList(HttpServletRequest request, @ModelAttribute BasicTerminalPaging params) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            HashMap<String,Object> dataObject = new HashMap<String,Object>();
            dataObject = basicTerminalSerivce.getDataListByPaging(params);
            map.put("result",dataObject);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }

    @ResponseBody
    @PostMapping("/basic/terminalAllList")
    public HashMap<String, Object> terminalAllList(HttpServletRequest request) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            List<BasicTerminal> dataList = basicTerminalSerivce.getDataList();
            map.put("result", dataList);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }
    @ResponseBody
    @PostMapping("/basic/terminalIdCheck")
    public HashMap<String, String> groupIdCheck(HttpServletRequest request,@ModelAttribute BasicTerminal params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            String result = basicTerminalSerivce.getTerminalIdCheck(params);
            map.put("result",result);
        } else {
            map.put("result", "notlogin");
        }
        return map;

    }
    @ResponseBody
    @PostMapping("/basic/getTerminalInfo")
    public HashMap<String, Object> getTerminalInfo(HttpServletRequest request,@ModelAttribute BasicTerminal params) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            if(params.getId()!=0) {
                int id = params.getId();
                BasicTerminal result = basicTerminalSerivce.getTerminalInfo(id);
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
    @GetMapping("/basic/insertTerminal")
    public HashMap<String, String> insertTerminal(HttpServletRequest request, @ModelAttribute BasicTerminal params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            String result = basicTerminalSerivce.getTerminalIdCheck(params);
            if(result.equals("succ")) {
                basicTerminalSerivce.insertData(params);
                map.put("result", "succ");
            } else {
                map.put("result", "isTerminalId");
            }

        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/updateTerminal")
    public HashMap<String, String> updateTerminal(HttpServletRequest request, @ModelAttribute BasicTerminal params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicTerminalSerivce.updateData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/basic/deleteTerminal")
    public HashMap<String, String> deleteTerminal(HttpServletRequest request, @ModelAttribute BasicTerminal params) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        String loginResult = memberService.getSessionCheck(request);
        if(loginResult.equals("succ")) {
            basicTerminalSerivce.deleteData(params);
            map.put("result", "succ");
        } else {
          map.put("result", "notlogin");
        }
        return map;
    }
}
