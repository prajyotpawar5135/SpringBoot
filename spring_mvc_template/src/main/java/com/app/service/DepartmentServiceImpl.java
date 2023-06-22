package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DepartmentDaoImpl;
import com.app.pojos.Department;
@Service   //mandatory annotation to tell spring container ,following is a spring bean,containing B.L.;
@Transactional  //mandatory annotation to tell spring container to manage transaction automatically;
public class DepartmentServiceImpl implements DepartmentService {
//dependency:dao layer i/f
	@Autowired  //byType:field level DI
	private DepartmentDaoImpl deptDao;
	
	@Override
	public List<Department> getAllDepts() {
		return deptDao.getAllDepartments();
	}

}
