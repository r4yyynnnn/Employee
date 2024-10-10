package com.swamedia.siswa.mapper;

import com.swamedia.siswa.dto.EmployeeDto;
import com.swamedia.siswa.entity.Employee;

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
