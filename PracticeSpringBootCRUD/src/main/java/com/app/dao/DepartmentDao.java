package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;

@Repository											//entity type  ,id type
public interface DepartmentDao extends JpaRepository<Department,Long>{
  
}
