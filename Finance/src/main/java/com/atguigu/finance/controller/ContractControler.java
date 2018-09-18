package com.atguigu.finance.controller;


import com.alibaba.fastjson.JSON;
import com.atguigu.finance.bean.NplmLoanContract;
import com.atguigu.finance.service.CaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ContractControler {

    @Autowired
    CaService caService;

    @RequestMapping("index")
    public String index(){
        return "smp";
    }

    //去往合同列表页面
    @RequestMapping(value = "cantcatList")
    public String cantcatList(NplmLoanContract nplmLoanContract, HttpServletRequest request){

        //String contractJson = request.getParameter("contractJson");
        //NplmLoanContract nplmLoanContract = JSON.parseObject(contractJson, NplmLoanContract.class);
        //List<Map> list = JSON.parseArray(contractJson, Map.class);
       // String parameter = request.getParameter("nplmBorrowerInfo.clientName");
        //System.out.println(parameter);

        List<NplmLoanContract> loanContracts = caService.findAll(nplmLoanContract);

        nplmLoanContract = null;
        request.setAttribute("loanContracts",loanContracts);
        return "cantcatList";
    }

}
