package com.bridgeLabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollApplication.class, args);
		log.info("Employee payroll App Started");
	}

}
