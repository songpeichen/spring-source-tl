package com.tuling.setInject;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * Created by smlz on 2019/10/28.
 */
@Component
public class Test2 implements BeanDefinitionRegistryPostProcessor,PriorityOrdered {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("33333");
/*		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) registry.getBeanDefinition("test1");
		genericBeanDefinition.setAbstract(true);*/
		registry.removeBeanDefinition("test1");
		//System.out.println(genericBeanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("444444");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
