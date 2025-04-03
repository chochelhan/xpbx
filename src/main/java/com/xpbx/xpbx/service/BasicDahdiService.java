package com.xpbx.xpbx.service;

import com.xpbx.xpbx.domain.BasicDahdi;
import com.xpbx.xpbx.domain.BasicDahdiPaging;
import com.xpbx.xpbx.domain.Total;
import com.xpbx.xpbx.mapper.BasicDahdiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class BasicDahdiService {

    @Autowired
    private BasicDahdiMapper basicDahdiMapper;

    public HashMap<String, Object> getDataListByPaging(BasicDahdiPaging params) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        Total totalObj  = basicDahdiMapper.selectTotal();
        int countTotal = totalObj.getCountTotal();
        int Limit = 10;
        int page = 1;
        if(!StringUtils.isEmpty(params.getPage())) {
            page = Integer.parseInt(params.getPage());
        }
        int Start = (page - 1) * Limit;
        params.setLimit(Limit);
        params.setStart(Start);
        List<BasicDahdi> dataList = basicDahdiMapper.selectDataListByPagin(params);
        map.put("limit", Limit);
        map.put("total",countTotal);
        map.put("dataList",dataList);
        map.put("page",page);
        return map;
    }
    public List<BasicDahdi> getDataList() {

        return basicDahdiMapper.selectDataList();
    }
    public void insertData(BasicDahdi params) {

        basicDahdiMapper.insertData(params);
    }
    public void updateData(BasicDahdi params) {

        basicDahdiMapper.updateData(params);
    }
    public void deleteData(BasicDahdi params) {

        basicDahdiMapper.deleteData(params);
    }
}
