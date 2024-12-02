package com.example.designpattern.ProxyDesignPattern.EmployeeExample;

public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo empDao) throws Exception {

        // Security - Only Admin has the access to create
        if (client.equals("ADMIN")) {
            employeeDao.create(client, empDao);
            return;
        }
        throw new Exception("Access Denied.");
    }

    @Override
    public void delete(String client, int empId) throws Exception {

        // Security - Only Admin has the access to delete
        if (client.equals("ADMIN")) {
            employeeDao.delete(client, empId);
            return;
        }
        throw new Exception("Access Denied.");
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception {

        // Security - Only Admin has the access to delete
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDao.get(client, empId);
        }
        throw new Exception("Access Denied.");
    }

}
