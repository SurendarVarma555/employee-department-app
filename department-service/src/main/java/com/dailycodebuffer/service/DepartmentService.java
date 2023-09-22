package com.dailycodebuffer.service;

import com.dailycodebuffer.model.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartment(long id);
}
