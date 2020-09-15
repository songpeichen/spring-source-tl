package com.tuling.setInject;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by smlz on 2019/10/28.
 */
@Component
public class Test1 implements BeanDefinitionRegistryPostProcessor,Ordered {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("11111");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("222222");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
