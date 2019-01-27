package com.cnsuning.spring.start.service.inf;

import com.cnsuning.spring.start.entity.StatementOfAccount;

public interface HomeService {
    StatementOfAccount selectByPrimaryKey(Long index);
    StatementOfAccount select(Long index);

}
