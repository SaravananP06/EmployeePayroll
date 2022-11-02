package com.bridgeLabz.employeepayrollapp.controllers;

import com.bridgeLabz.employeepayrollapp.EmployeePayrollApplication;
import com.bridgeLabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgeLabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgeLabz.employeepayrollapp.models.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {""," ","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new  EmployeePayrollData(1, new EmployeePayrollDTO("Saravanan", 500000));
        ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successfull", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Saravanan", 500000));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", employeePayrollData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successfully", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Updates Employee Payroll Data Successfully", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully","Deleted id: "+empId);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }


}
