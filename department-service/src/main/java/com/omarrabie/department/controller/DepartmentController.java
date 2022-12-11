package com.omarrabie.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import com.omarrabie.department.entity.Department;
import com.omarrabie.department.service.DepartmentService;

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @PostMapping("/")
  public Department saveDepartment(@RequestBody Department department) {
    log.info("Inside savedepatment method of departmentcontroller");
    return departmentService.saveDepartment(department);
  }

  @GetMapping("/{id}")
  public Department findDepartmentById(@PathVariable("id") Long departmentId) {
    log.info("Inside findDepartmentById method of DepartmentController");
    return departmentService.findDepartmentById(departmentId);
  }
}
