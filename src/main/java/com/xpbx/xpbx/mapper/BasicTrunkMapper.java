package com.xpbx.xpbx.mapper;

import com.xpbx.xpbx.domain.BasicTrunk;
import com.xpbx.xpbx.domain.BasicTrunkPaging;
import com.xpbx.xpbx.domain.Total;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BasicTrunkMapper {

    Total selectTotal();
    List<BasicTrunk> selectDataListByPagin(BasicTrunkPaging params);
    List<BasicTrunk> selectDataList();
    void insertData(BasicTrunk params);
    void updateData(BasicTrunk params);
    void deleteData(BasicTrunk params);
}
