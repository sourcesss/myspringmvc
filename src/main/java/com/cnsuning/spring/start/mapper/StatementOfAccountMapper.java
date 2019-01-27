package com.cnsuning.spring.start.mapper;

import com.cnsuning.spring.start.entity.StatementOfAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StatementOfAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StatementOfAccount record);

    int insertSelective(StatementOfAccount record);

    StatementOfAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StatementOfAccount record);

    int updateByPrimaryKey(StatementOfAccount record);
}