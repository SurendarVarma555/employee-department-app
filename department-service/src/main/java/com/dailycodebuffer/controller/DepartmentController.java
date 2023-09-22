package com.dailycodebuffer.controller;

import com.dailycodebuffer.model.Department;
import com.dailycodebuffer.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping()
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        return new ResponseEntity<>(departmentService.saveDepartment(department), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable("id") long id){
        return  new ResponseEntity<>(departmentService.getDepartment(id),HttpStatus.OK);

    }
}
