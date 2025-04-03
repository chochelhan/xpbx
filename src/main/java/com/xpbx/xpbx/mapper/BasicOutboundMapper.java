package com.xpbx.xpbx.mapper;

import com.xpbx.xpbx.domain.BasicOutbound;
import com.xpbx.xpbx.domain.BasicOutboundPaging;
import com.xpbx.xpbx.domain.Total;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BasicOutboundMapper {

    Total selectTotal();
    List<BasicOutbound> selectDataListByPagin(BasicOutboundPaging params);

    List<BasicOutbound> selectDataList();
    void insertData(BasicOutbound params);
    void updateData(BasicOutbound params);
    void deleteData(BasicOutbound params);
}
