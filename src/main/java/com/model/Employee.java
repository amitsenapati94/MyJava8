package com.model;
import java.util.List;

public class Employee{


    private String empId;
    private String parentEmpId;
    private List<Employee> employeeList;
    private boolean isAdvisor;
    private long advisorCount;

    public long getAdvisorCount() {
        return advisorCount;
    }

    public void setAdvisorCount(long advisorCount) {
        this.advisorCount = advisorCount;
    }

    public boolean isAdvisor() {
        return isAdvisor;
    }

    public void setAdvisor(boolean isAdvisor) {
        this.isAdvisor = isAdvisor;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getParentEmpId() {
        return parentEmpId;
    }

    public void setParentEmpId(String parentEmpId) {
        this.parentEmpId = parentEmpId;
    }
}