package com.dailycodebuffer.service.impl;

import com.dailycodebuffer.exception.ResourceNotFoundException;
import com.dailycodebuffer.model.Department;
import com.dailycodebuffer.repository.DepartmentRepository;
import com.dailycodebuffer.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment (Department department){
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartment (Long id){
        return departmentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Department","id",id));
    }

}
