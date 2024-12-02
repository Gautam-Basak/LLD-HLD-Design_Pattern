package com.example.designpattern.ProxyDesignPattern.EmployeeExample;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo empDao) throws Exception {
        
        // Create new row
        System.out.println("Create row in Employee table");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        
        // Delete a row
        System.out.println("Deleted a row in Employee table");
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception {
        
        // Get the reocrd
        System.out.println("Fetched the record");
        return new EmployeeDo();
    }
    
}
