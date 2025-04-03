package com.xpbx.xpbx.service;

import com.xpbx.xpbx.domain.AddRinggroup;
import com.xpbx.xpbx.domain.AddRinggroupPaging;
import com.xpbx.xpbx.domain.Total;
import com.xpbx.xpbx.mapper.AddRinggroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class AddRinggroupService {

    @Autowired
    private AddRinggroupMapper addRinggroupMapper;


    public HashMap<String, Object> getDataListByPaging(AddRinggroupPaging params) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        Total totalObj  = addRinggroupMapper.selectTotal(params);
        int countTotal = totalObj.getCountTotal();
        int Limit = 10;
        int page = 1;
        if(!StringUtils.isEmpty(params.getPage())) {
            page = Integer.parseInt(params.getPage());
        }
        int Start = (page - 1) * Limit;
        params.setLimit(Limit);
        params.setStart(Start);
        List<AddRinggroup> dataList = addRinggroupMapper.selectDataListByPagin(params);

        map.put("limit", Limit);
        map.put("total",countTotal);
        map.put("dataList",dataList);
        map.put("page",page);
        return map;
    }
    public List<AddRinggroup> getDataList() {

        return addRinggroupMapper.selectDataList();
    }
    public void insertData(AddRinggroup params) {

        addRinggroupMapper.insertData(params);
    }
    public void updateData(AddRinggroup params) {

        addRinggroupMapper.updateData(params);
    }
    public void deleteData(AddRinggroup params) {

        addRinggroupMapper.deleteData(params);
    }
}
