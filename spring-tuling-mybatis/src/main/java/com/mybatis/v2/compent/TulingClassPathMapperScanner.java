package com.mybatis.v2.compent;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: 支持扫描接口的bean定义
 * @author: smlz
 * @date 2020/5/5 14:15
 */

public class TulingClassPathMapperScanner extends ClassPathBeanDefinitionScanner {

	public TulingClassPathMapperScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	//bean定义类型是接口的 可以添加到BeanDefinitionMap中
	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		return beanDefinition.getMetadata().isInterface();
	}

	@Override
	protected Set<BeanDefinitionHolder> doScan(String... basePackages) {

		return super.doScan(basePackages);
	}
}


