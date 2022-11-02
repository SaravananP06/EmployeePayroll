package com.bridgeLabz.employeepayrollapp.services;

import com.bridgeLabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgeLabz.employeepayrollapp.models.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeePayrollData(int empId);
}
