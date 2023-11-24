/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author vvt
 */
public class Employee extends User implements Serializable{
    private static final long serialVersionUID = 109999L;
    private double salary;

    public Employee() {
    }
    
    public Employee(User user, double salary) {
        super(user);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + getId() + ", name=" + getName() + ", username=" + getUsername() + ", type=" + getType() + ", status=" + isStatus() + ", salary=" + salary + '}';
    }
}
