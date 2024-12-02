package com.example.designpattern.ProxyDesignPattern.EmployeeExample;

public interface EmployeeDao {

    public void create(String client, EmployeeDo empDao) throws Exception;

    public void delete(String client, int empId) throws Exception;

    public EmployeeDo get(String client, int empId) throws Exception;
}
