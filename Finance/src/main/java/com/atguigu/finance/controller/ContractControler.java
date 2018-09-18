package com.atguigu.finance.controller;

import com.atguigu.finance.bean.NplmBorrowerInfo;
import com.atguigu.finance.bean.NplmContractAttribute;
import com.atguigu.finance.bean.NplmLoanContract;
import com.atguigu.finance.bean.NplmOverdueContract;
import com.atguigu.finance.service.CaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        @RequestMapping("合同列表")
        public String cantcatList(HttpServletRequest request){
            List<NplmContractAttribute> nplmContractAttributes = caService.contractAttributeList();
            for (NplmContractAttribute nplmContractAttribute : nplmContractAttributes) {
                String loanContractId = nplmContractAttribute.getLoanContractId();
                NplmLoanContract nplmLoanContract = caService.selecteLoanContractById(loanContractId);
                String borrowerId = nplmLoanContract.getBorrowerId();
                NplmBorrowerInfo nplmBorrowerInfo = caService.selectBorrowerInfoById(borrowerId);
                nplmLoanContract.setNplmBorrowerInfo(nplmBorrowerInfo);
                nplmContractAttribute.setNplmLoanContract(nplmLoanContract);

            }
            request.setAttribute("nplmContractAttributes",nplmContractAttributes);
        return "合同列表";
    }

}
