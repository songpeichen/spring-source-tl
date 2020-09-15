package com.mybatis.v3;


import com.mybatis.v2.config.SpringMybatisConfig;
import com.mybatis.v2.dao.AccountMapper;
import com.mybatis.v2.dao.ProductMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/5/4 15:07
 */
public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
					= new AnnotationConfigApplicationContext(SpringMybatisConfig.class);

		ProductMapper productMapper = (ProductMapper) context.getBean("productMapper");
		productMapper.qryProductInfoById(1);
		AccountMapper accountMapper = (AccountMapper) context.getBean("accountMapper");
		accountMapper.qryAccount(1);
	}

}
