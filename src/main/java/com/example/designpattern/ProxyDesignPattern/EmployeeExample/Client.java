package com.example.designpattern.ProxyDesignPattern.EmployeeExample;

public class Client {
    
    public static void main(String[] args) {

        try {
            EmployeeDao emp = new EmployeeDaoProxy();
            emp.create("ADMIN", new EmployeeDo());
            emp.get("USER", 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
