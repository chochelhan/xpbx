package com.xpbx.xpbx.mapper;

import com.xpbx.xpbx.domain.BasicDvr;
import com.xpbx.xpbx.domain.BasicDvrPaging;
import com.xpbx.xpbx.domain.Total;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BasicDvrMapper {

    Total selectTotal(BasicDvrPaging params);
    List<BasicDvr> selectDataListByPagin(BasicDvrPaging params);
    List<BasicDvr> selectDataList();
    void insertData(BasicDvr params);
    void updateData(BasicDvr params);
    void deleteData(BasicDvr params);
}
