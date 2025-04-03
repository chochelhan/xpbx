package com.xpbx.xpbx.service;

import com.xpbx.xpbx.domain.BasicDvr;
import com.xpbx.xpbx.domain.BasicDvrPaging;
import com.xpbx.xpbx.domain.Total;
import com.xpbx.xpbx.mapper.BasicDvrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class BasicDvrService {

    @Autowired
    private BasicDvrMapper basicDvrMapper;

    public HashMap<String, Object> getDataListByPaging(BasicDvrPaging params) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        Total totalObj  = basicDvrMapper.selectTotal(params);
        int countTotal = totalObj.getCountTotal();
        int Limit = 10;
        int page = 1;
        if(!StringUtils.isEmpty(params.getPage())) {
            page = Integer.parseInt(params.getPage());
        }
        int Start = (page - 1) * Limit;
        params.setLimit(Limit);
        params.setStart(Start);
        List<BasicDvr> dataList = basicDvrMapper.selectDataListByPagin(params);
        map.put("limit", Limit);
        map.put("total",countTotal);
        map.put("dataList",dataList);
        map.put("page",page);
        return map;
    }

    public List<BasicDvr> getDataList() {

        return basicDvrMapper.selectDataList();
    }
    public void insertData(BasicDvr params) {

        basicDvrMapper.insertData(params);
    }
    public void updateData(BasicDvr params) {

        basicDvrMapper.updateData(params);
    }
    public void deleteData(BasicDvr params) {

        basicDvrMapper.deleteData(params);
    }
}
