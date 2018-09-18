package com.atguigu.finance.service;


import com.atguigu.finance.bean.NplmLoanContract;

import java.util.List;

public interface CaService {

    //void saveInfo(NplmBorrowerInfo nplmBorrowerInfo);


    //List<NplmContractAttribute> contractAttributeList();
    //NplmBorrowerInfo selectBorrowerInfoById(String id);
    //NplmLoanContract selecteLoanContractById(String id);

    List<NplmLoanContract> findAll(NplmLoanContract nplmLoanContract);
    //List<NplmLoanContract> findAll();

}
