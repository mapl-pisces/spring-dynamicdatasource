package com.ai.duxiefenli.mapper;

import java.util.List;

import com.ai.duxiefenli.DataSource;

public interface SysConfigMapper {
    int countByExample(SysConfigCriteria example);

    int deleteByExample(SysConfigCriteria example);
    @DataSource("slave")
    int deleteByPrimaryKey(Integer id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    List<SysConfig> selectByExample(SysConfigCriteria example);
    @DataSource("master")
    SysConfig selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}