package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;

@Repository  //mandatory annotation to tell sc :following is a spring bean containing data access logic
public class DepartmentDaoImpl implements DepartmentDao{
 //dependency :SF(Session factory)
	@Autowired //mandatory depedency:required true,Field level dependency injection(DI)
	private SessionFactory sf; //automatically supplied by spring supplied LocalSessionFactoryBean 
	
	
	@Override
	public List<Department> getAllDepartments() {

		
		return sf.getCurrentSession()
				.createQuery("select d from Department d ",Department.class)
				.getResultList();
	}

}
