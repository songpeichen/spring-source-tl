package com.mybatis.v4.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.mybatis.v4.entity.Dept;
import com.mybatis.v4.entity.Employee;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/5/7 14:25
 */
@Configuration
@ComponentScan(basePackages = {"com.mybatis.v4"})
@MapperScan(basePackages = {"com.mybatis.v4.mapper"})
@EnableTransactionManagement
public class SpringMyBatisConfig {

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws IOException {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
		// 设置 MyBatis 配置文件路径
		factoryBean.setConfigLocation(new ClassPathResource("mybatis/mybatis-config.xml"));
		// 设置 SQL 映射文件路径
		factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*.xml"));
		factoryBean.setTypeAliases(Employee.class,Dept.class);
		return factoryBean;
	}



	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("Zw726515");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/tuling-vip?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8");
		return dataSource;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		PlatformTransactionManager transactionManager = new DataSourceTransactionManager(dataSource());
		return transactionManager;
	}


}
