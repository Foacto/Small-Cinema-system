/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import com.htc.test.ws.BankAccount;

/**
 *
 * @author vvt
 */
public interface Payment {
    public Boolean createPayment(BankAccount bankAccount, double payMoney, String companyId);
}
