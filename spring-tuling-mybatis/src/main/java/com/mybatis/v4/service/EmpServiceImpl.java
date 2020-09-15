package com. mybatis.v4.service;


import com.mybatis.v4.entity.Employee;
import com.mybatis.v4.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * Created by smlz on 2019/8/23.
 */
@Service
public class EmpServiceImpl  {

	@Autowired
	private EmployeeMapper employeeMapper;


	public Employee qryById(Integer empId) {
		return employeeMapper.findOne(1);
	}


}
