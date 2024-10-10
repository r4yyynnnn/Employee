package com.swamedia.siswa.service.impl;

import com.swamedia.siswa.dto.EmployeeDto;
import com.swamedia.siswa.entity.Employee;
import com.swamedia.siswa.exception.ResourceNotFoundException;
import com.swamedia.siswa.mapper.EmployeeMapper;
import com.swamedia.siswa.repository.EmployeeRepository;
import com.swamedia.siswa.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee is not exist" + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(employee ->  EmployeeMapper.mapToEmployeeDto(employee))
                .collect(Collectors.toList());

    }
}
