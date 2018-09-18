package com.atguigu.finance.service.impl;

import com.atguigu.finance.bean.NplmBorrowerInfo;
import com.atguigu.finance.bean.NplmContractAttribute;
import com.atguigu.finance.bean.NplmLoanContract;
import com.atguigu.finance.mapper.NplmBorrowerInfoMapper;
import com.atguigu.finance.mapper.NplmContractAttributeMapper;
import com.atguigu.finance.mapper.NplmLoanContractMapper;
import com.atguigu.finance.service.CaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaServiceImpl implements CaService{

    @Autowired
    private NplmBorrowerInfoMapper nplmBorrowerInfoMapper;

    @Autowired
    private NplmLoanContractMapper nplmLoanContractMapper;

    @Autowired
    private NplmContractAttributeMapper nplmContractAttributeMapper;


    @Override
    public List<NplmContractAttribute> contractAttributeList() {
        List<NplmContractAttribute> nplmContractAttributes = nplmContractAttributeMapper.selectAll();

        return nplmContractAttributes;
    }

    @Override
    public NplmBorrowerInfo selectBorrowerInfoById(String id) {
        NplmBorrowerInfo borrowerInfo1 = nplmBorrowerInfoMapper.selectByPrimaryKey(id);
        return borrowerInfo1;
    }

    @Override
    public NplmLoanContract selecteLoanContractById(String id) {

        NplmLoanContract loanContract = nplmLoanContractMapper.selectByPrimaryKey(id);

        return loanContract;
    }


}
