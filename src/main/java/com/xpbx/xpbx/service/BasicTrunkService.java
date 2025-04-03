package com.xpbx.xpbx.service;

import com.xpbx.xpbx.domain.BasicTrunk;
import com.xpbx.xpbx.domain.BasicTrunkPaging;
import com.xpbx.xpbx.domain.Total;
import com.xpbx.xpbx.mapper.BasicTrunkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class BasicTrunkService {

    @Autowired
    private BasicTrunkMapper basicTrunkMapper;

    public HashMap<String, Object> getDataListByPaging(BasicTrunkPaging params) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        Total totalObj  = basicTrunkMapper.selectTotal();
        int countTotal = totalObj.getCountTotal();
        int Limit = 10;
        int page = 1;
        if(!StringUtils.isEmpty(params.getPage())) {
            page = Integer.parseInt(params.getPage());
        }
        int Start = (page - 1) * Limit;
        params.setLimit(Limit);
        params.setStart(Start);
        List<BasicTrunk> dataList = basicTrunkMapper.selectDataListByPagin(params);
        map.put("limit", Limit);
        map.put("total",countTotal);
        map.put("dataList",dataList);
        map.put("page",page);
        return map;
    }
    public List<BasicTrunk> getDataList() {

        return basicTrunkMapper.selectDataList();
    }
    public void insertData(BasicTrunk params) {

        basicTrunkMapper.insertData(params);
    }
    public void updateData(BasicTrunk params) {

        basicTrunkMapper.updateData(params);
    }
    public void deleteData(BasicTrunk params) {

        basicTrunkMapper.deleteData(params);
    }
}
