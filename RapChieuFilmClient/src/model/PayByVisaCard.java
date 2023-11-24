/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.htc.test.ws.BankAccount;

/**
 *
 * @author vvt
 */
public class PayByVisaCard implements Payment{

    @Override
    public Boolean createPayment(BankAccount bankAccount, double payMoney, String companyId) {
        return makePayment(bankAccount, payMoney, companyId);
    }

    private static Boolean makePayment(com.htc.test.ws.BankAccount bankAccount, double payMoney, java.lang.String companyId) {
        com.htc.test.ws.VisaWS_Service service = new com.htc.test.ws.VisaWS_Service();
        com.htc.test.ws.VisaWS port = service.getVisaWSPort();
        return port.makePayment(bankAccount, payMoney, companyId);
    }
    
}
