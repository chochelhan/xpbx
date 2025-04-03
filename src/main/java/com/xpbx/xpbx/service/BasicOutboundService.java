package com.xpbx.xpbx.service;

import com.xpbx.xpbx.domain.BasicOutbound;
import com.xpbx.xpbx.domain.BasicOutboundPaging;
import com.xpbx.xpbx.domain.Total;
import com.xpbx.xpbx.mapper.BasicOutboundMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class BasicOutboundService {

    @Autowired
    private BasicOutboundMapper basicOutboundMapper;

    public HashMap<String, Object> getDataListByPaging(BasicOutboundPaging params) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        Total totalObj  = basicOutboundMapper.selectTotal();
        int countTotal = totalObj.getCountTotal();
        int Limit = 10;
        int page = 1;
        if(!StringUtils.isEmpty(params.getPage())) {
            page = Integer.parseInt(params.getPage());
        }
        int Start = (page - 1) * Limit;
        params.setLimit(Limit);
        params.setStart(Start);
        List<BasicOutbound> dataList = basicOutboundMapper.selectDataListByPagin(params);
        map.put("limit", Limit);
        map.put("total",countTotal);
        map.put("dataList",dataList);
        map.put("page",page);
        return map;
    }
    public List<BasicOutbound> getDataList() {

        return basicOutboundMapper.selectDataList();
    }
    public void insertData(BasicOutbound params) {

        basicOutboundMapper.insertData(params);
    }
    public void updateData(BasicOutbound params) {

        basicOutboundMapper.updateData(params);
    }
    public void deleteData(BasicOutbound params) {

        basicOutboundMapper.deleteData(params);
    }
}
