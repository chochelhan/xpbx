package com.xpbx.xpbx.mapper;

import com.xpbx.xpbx.domain.BasicTerminal;
import com.xpbx.xpbx.domain.BasicTerminalPaging;
import com.xpbx.xpbx.domain.Total;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BasicTerminalMapper {

    Total selectTotal(BasicTerminalPaging params);
    BasicTerminal selectTerminalIdCheck(String groupId);
    BasicTerminal selectDataInfo(int id);
    List<BasicTerminal> selectDataListByPagin(BasicTerminalPaging params);
    List<BasicTerminal> selectDataList();
    void insertData(BasicTerminal params);
    void updateData(BasicTerminal params);
    void deleteData(BasicTerminal params);
}
