package com.omarrabie.department.repository;

import com.omarrabie.department.entity.Department;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

  Department findByDepartmentId(Long departmentId);
  
}
