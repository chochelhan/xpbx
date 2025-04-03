package com.xpbx.xpbx.mapper;

import com.xpbx.xpbx.domain.BasicDahdi;
import com.xpbx.xpbx.domain.BasicDahdiPaging;
import com.xpbx.xpbx.domain.Total;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BasicDahdiMapper {

    Total selectTotal();
    List<BasicDahdi> selectDataListByPagin(BasicDahdiPaging params);
    List<BasicDahdi> selectDataList();
    void insertData(BasicDahdi params);
    void updateData(BasicDahdi params);
    void deleteData(BasicDahdi params);
}
