package com.bridgeLabz.employeepayrollapp.services;

import com.bridgeLabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgeLabz.employeepayrollapp.models.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData(){
        List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        employeePayrollDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Saravanan",5000000)));
        return  employeePayrollDataList;
    }
    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Saravanan",50000000));
        return  employeePayrollData;
    }
    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        return  employeePayrollData;
    }
    @Override
    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        return  employeePayrollData;
    }
    @Override
    public void deleteEmployeePayrollData(int empId){

    }
}
