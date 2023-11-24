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
public class Context {
    private Payment strategy;

    public Context(Payment strategy) {
        this.strategy = strategy;
    }
    
    public Boolean excute(BankAccount bankAccount, double payMoney, String companyId) {
        return strategy.createPayment(bankAccount, payMoney, companyId);
    }
}
