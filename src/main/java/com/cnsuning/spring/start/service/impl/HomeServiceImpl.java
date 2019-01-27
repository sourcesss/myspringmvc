package com.cnsuning.spring.start.service.impl;

import com.cnsuning.spring.start.aspect.MyAspect;
import com.cnsuning.spring.start.entity.StatementOfAccount;
import com.cnsuning.spring.start.mapper.StatementOfAccountMapper;
import com.cnsuning.spring.start.service.inf.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    private StatementOfAccountMapper mapper;

    @Override
    @MyAspect("以id为key检索entity")
    public StatementOfAccount selectByPrimaryKey(Long index){
        return mapper.selectByPrimaryKey(index);
    }

    @Override
    public StatementOfAccount select(Long index){
        return mapper.selectByPrimaryKey(index);
    }
}
