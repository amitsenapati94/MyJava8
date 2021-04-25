package com.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGraph {

    public static Employee createEmployeeGraph() {
    /*

    Employee graph with emp1 as top node
    emp2 contains 2 childs and parent as emp1
    emp3 contains 2 childs and parent as emp2

    program calculates total advisor count for the bottom most child items.

     */

        Employee emp1 = new Employee();
        emp1.setEmpId("100");
        emp1.setAdvisor(false);
        emp1.setAdvisorCount(15);

        Employee emp2 = new Employee();
        emp2.setEmpId("200");
        emp2.setParentEmpId("100");
        emp2.setAdvisor(false);
        emp2.setAdvisorCount(10);

        Employee emp21 = new Employee();
        emp21.setEmpId("201");
        emp21.setParentEmpId("200");
        emp21.setAdvisor(true);
        emp21.setAdvisorCount(10);

        Employee emp22 = new Employee();
        emp22.setEmpId("202");
        emp22.setParentEmpId("200");
        emp22.setAdvisor(true);
        emp22.setAdvisorCount(12);


        Employee emp3 = new Employee();
        emp3.setEmpId("300");
        emp3.setParentEmpId("200");
        emp3.setAdvisor(false);
        emp2.setAdvisorCount(5);

        Employee emp31 = new Employee();
        emp31.setEmpId("301");
        emp31.setAdvisor(true);
        emp31.setParentEmpId("300");
        emp31.setAdvisorCount(50);

        Employee emp32 = new Employee();
        emp32.setEmpId("302");
        emp32.setAdvisor(true);
        emp32.setParentEmpId("300");
        emp32.setAdvisorCount(20);


        //add child to Emp2
        List childListForEmp2 = new ArrayList();
        childListForEmp2.add(emp21);
        childListForEmp2.add(emp22);
        emp2.setEmployeeList(childListForEmp2);


        //add Emp2 to Emp1
        List emp2List = new ArrayList();
        emp2List.add(emp2);
        emp1.setEmployeeList(emp2List);


        //add child to Emp3
        List childListForEmp3 = new ArrayList();
        childListForEmp3.add(emp31);
        childListForEmp3.add(emp32);
        emp3.setEmployeeList(childListForEmp3);

        //add Emp3 to Emp2
        List emp3List = new ArrayList<>();
        emp3List.add(emp3);
        emp2.getEmployeeList().addAll(emp3List);
        return emp1;
    }
}
