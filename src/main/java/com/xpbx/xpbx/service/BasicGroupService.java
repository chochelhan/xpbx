package com.xpbx.xpbx.service;

import com.xpbx.xpbx.domain.BasicGroup;
import com.xpbx.xpbx.domain.BasicGroupPaging;
import com.xpbx.xpbx.domain.Total;
import com.xpbx.xpbx.mapper.BasicGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class BasicGroupService {

    @Autowired
    private BasicGroupMapper basicGroupMapper;


    public HashMap<String, Object> getDataListByPaging(BasicGroupPaging params) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        Total totalObj  = basicGroupMapper.selectTotal(params);
        int countTotal = totalObj.getCountTotal();
        int Limit = 10;
        int page = 1;
        if(!StringUtils.isEmpty(params.getPage())) {
            page = Integer.parseInt(params.getPage());
        }
        int Start = (page - 1) * Limit;
        params.setLimit(Limit);
        params.setStart(Start);
        List<BasicGroup> dataList = basicGroupMapper.selectDataListByPagin(params);

        map.put("limit", Limit);
        map.put("total",countTotal);
        map.put("dataList",dataList);
        map.put("page",page);
        return map;
    }
    public List<BasicGroup> getDataList() {

        return basicGroupMapper.selectDataList();
    }
    public String getGroupIdCheck(BasicGroup params) {
        String result = "fail";
        if(!StringUtils.isEmpty(params.getGroupId())) {
            BasicGroup groupInfo = basicGroupMapper.selectGroupIdCheck(params.getGroupId());
            if(groupInfo==null) {
                result = "succ";
            }
        }
        return result;
    }
    public BasicGroup getGroupInfo(int id) {

        BasicGroup groupInfo = basicGroupMapper.selectGroupInfo(id);
        if(groupInfo == null) {
            groupInfo.setId(0);
        }
        return groupInfo;
    }

    public void insertData(BasicGroup params) {

        basicGroupMapper.insertData(params);
    }
    public void updateData(BasicGroup params) {

        basicGroupMapper.updateData(params);
    }
    public void deleteData(BasicGroup params) {

        basicGroupMapper.deleteData(params);
    }
}
