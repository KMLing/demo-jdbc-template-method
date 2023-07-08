package com.example.demojdbctemplatemethod.service;

import com.example.demojdbctemplatemethod.dao.EmployeeDao;
import org.springframework.stereotype.Service;

@Service
public class EmployeeReportService {

    private final EmployeeDao employeeDao;
    public EmployeeReportService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void printReport(){
        System.out.println("Employee Report Start.");

        System.out.println("findEmployees()");
        employeeDao.findEmployees().forEach(System.out::println);

        System.out.println("findEmployeeEmail()");
        employeeDao.findEmployeeEmails().forEach(System.out::println);

        System.out.println("findEmployeeWithHighSalary");
        System.out.println(employeeDao.findEmployeeWithHighSalary());

        System.out.println("findEmployeeByID");
        System.out.println(employeeDao.findEmployeeById(3));

        System.out.println("hiredLast");
        System.out.println(employeeDao.findEmployeeThatWasHiredLast());

        System.out.println("findEmployeeByEmailandPhones");
        System.out.println(employeeDao.findEmployeeEmailsAndPhones());

        employeeDao.insertNewDummyRecord();
        employeeDao.findEmployees().forEach(System.out::println);

        System.out.println("UpdateDummyRecord");
        System.out.println("Result From update:"+employeeDao.updateRecord(99,"Kuang Myat Linn"));
        System.out.println(employeeDao.findEmployeeById(99));

        System.out.println("Employee Report End");

    }
}
