package com.mybatis.v4;

import com.mybatis.v4.config.SpringMyBatisConfig;
import com.mybatis.v4.entity.Employee;
import com.mybatis.v4.mapper.DeptMapper;
import com.mybatis.v4.service.EmpServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/5/7 14:27
 */
public class SpringMyBatisMainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringMyBatisConfig.class);

		EmpServiceImpl empService = (EmpServiceImpl) context.getBean("empServiceImpl");

		Employee employee = empService.qryById(1);

		System.out.println(employee);

	}
}
