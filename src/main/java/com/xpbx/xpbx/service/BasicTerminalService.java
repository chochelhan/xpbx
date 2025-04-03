package com.xpbx.xpbx.service;

import com.xpbx.xpbx.domain.BasicTerminal;
import com.xpbx.xpbx.domain.BasicTerminalPaging;
import com.xpbx.xpbx.domain.Total;
import com.xpbx.xpbx.mapper.BasicTerminalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class BasicTerminalService {

    @Autowired
    private BasicTerminalMapper basicTerminalMapper;

    public HashMap<String, Object> getDataListByPaging(BasicTerminalPaging params) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        Total totalObj  = basicTerminalMapper.selectTotal(params);
        int countTotal = totalObj.getCountTotal();
        int Limit = 10;
        int page = 1;
        if(!StringUtils.isEmpty(params.getPage())) {
            page = Integer.parseInt(params.getPage());
        }
        int Start = (page - 1) * Limit;
        params.setLimit(Limit);
        params.setStart(Start);
        List<BasicTerminal> dataList = basicTerminalMapper.selectDataListByPagin(params);

        map.put("limit", Limit);
        map.put("total",countTotal);
        map.put("dataList",dataList);
        map.put("page",page);
        return map;
    }
    public String getTerminalIdCheck(BasicTerminal params) {
        String result = "fail";
        if(!StringUtils.isEmpty(params.getExtensionCallerid())) {
            BasicTerminal groupInfo = basicTerminalMapper.selectTerminalIdCheck(params.getExtensionCallerid());
            if(groupInfo==null) {
                result = "succ";
            }
        }
        return result;
    }
    public BasicTerminal getTerminalInfo(int id) {

        BasicTerminal terminalInfo = basicTerminalMapper.selectDataInfo(id);
        if(terminalInfo == null) {
            terminalInfo.setId(0);
        }
        return terminalInfo;
    }

    public List<BasicTerminal> getDataList() {

        return basicTerminalMapper.selectDataList();
    }
    public void insertData(BasicTerminal params) {

        basicTerminalMapper.insertData(params);
    }
    public void updateData(BasicTerminal params) {

        basicTerminalMapper.updateData(params);
    }
    public void deleteData(BasicTerminal params) {

        basicTerminalMapper.deleteData(params);
    }
}
