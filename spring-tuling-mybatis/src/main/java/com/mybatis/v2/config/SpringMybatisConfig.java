package com.mybatis.v2.config;

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



}
