package com.atguigu.finance.service;

import com.atguigu.finance.bean.NplmBorrowerInfo;
import com.atguigu.finance.bean.NplmContractAttribute;
import com.atguigu.finance.bean.NplmLoanContract;

import java.util.List;

public interface CaService {

    //void saveInfo(NplmBorrowerInfo nplmBorrowerInfo);


    List<NplmContractAttribute> contractAttributeList();
    NplmBorrowerInfo selectBorrowerInfoById(String id);
    NplmLoanContract selecteLoanContractById(String id);

}
