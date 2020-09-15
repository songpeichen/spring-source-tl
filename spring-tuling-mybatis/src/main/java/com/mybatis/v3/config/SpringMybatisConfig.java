package com.mybatis.v3.config;

import com.mybatis.v2.anno.EnableMapperScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/5/4 15:06
 */
@Configuration
@ComponentScan(value = {"com.mybatis.v2"})
@EnableMapperScanner(basePackage = "com.mybatis.v2.dao")
public class SpringMybatisConfig {

/*	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("Zw726515");
		dataSource.setUrl("jdbc:mysql://localhost:3306/tuling-spring-trans?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}*/

}
