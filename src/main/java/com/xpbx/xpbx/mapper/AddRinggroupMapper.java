package com.xpbx.xpbx.mapper;

import com.xpbx.xpbx.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AddRinggroupMapper {

    Total selectTotal(AddRinggroupPaging params);
    List<AddRinggroup> selectDataListByPagin(AddRinggroupPaging params);
    List<AddRinggroup> selectDataList();
    void insertData(AddRinggroup params);
    void updateData(AddRinggroup params);
    void deleteData(AddRinggroup params);
}
