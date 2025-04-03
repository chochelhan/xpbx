package com.xpbx.xpbx.mapper;

import com.xpbx.xpbx.domain.BasicGroup;
import com.xpbx.xpbx.domain.BasicGroupPaging;
import com.xpbx.xpbx.domain.Total;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BasicGroupMapper {

    Total selectTotal(BasicGroupPaging params);
    BasicGroup selectGroupIdCheck(String groupId);
    BasicGroup selectGroupInfo(int id);
    List<BasicGroup> selectDataListByPagin(BasicGroupPaging params);
    List<BasicGroup> selectDataList();
    void insertData(BasicGroup params);
    void updateData(BasicGroup params);
    void deleteData(BasicGroup params);
}
