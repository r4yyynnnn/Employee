package com.swamedia.employee.mapper;

import com.swamedia.employee.dto.EmployeeDto;
import com.swamedia.employee.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }


    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirst_Name(),
                employeeDto.getLast_Name(),
                employeeDto.getEmail()
        );
    }
}
