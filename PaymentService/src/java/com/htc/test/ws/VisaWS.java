/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.htc.test.ws;

import dao.BankAccountDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.BankAccount;

/**
 *
 * @author vvt
 */
@WebService(serviceName = "VisaWS")
public class VisaWS {
    /**
     * Web service operation
     */
    @WebMethod(operationName = "makePayment")
    public Boolean makePayment(@WebParam(name = "bankAccount") BankAccount bankAccount, @WebParam(name = "payMoney") double payMoney, @WebParam(name = "companyId") String companyId) {
        BankAccountDAO bad = new BankAccountDAO();
        bankAccount = bad.getBankAccount("VISA", bankAccount);
        if(bankAccount == null)
            return Boolean.FALSE;
        
        if(bankAccount.getMoney() < payMoney)
            return Boolean.FALSE;
        
        bad.makePayment("VISA", bankAccount, payMoney);
        
        return Boolean.TRUE;
    }
}
