package com.atguigu.finance.mapper;

import com.atguigu.finance.bean.NplmLoanContract;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NplmLoanContractMapper extends Mapper<NplmLoanContract> {

    List<NplmLoanContract> findAllContract(NplmLoanContract nplmLoanContract);

    /*List<NplmLoanContract> findAllContract();*/
}
