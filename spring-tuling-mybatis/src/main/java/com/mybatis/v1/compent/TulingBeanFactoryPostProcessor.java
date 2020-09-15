package com.mybatis.v1.compent;

import com.mybatis.v1.dao.ProductMapper;
import com.mybatis.v1.factorybean.AccountMapperFactoryBean;
import com.mybatis.v1.factorybean.ProductMapperFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/5/5 13:31
 */
@Component
public class TulingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition accountMapperBd= (GenericBeanDefinition) beanFactory.getBeanDefinition("accountMapper");
		System.out.println("accountMapperBd:"+accountMapperBd.toString());
		accountMapperBd.setBeanClass(AccountMapperFactoryBean.class);

		GenericBeanDefinition productMapperBd= (GenericBeanDefinition) beanFactory.getBeanDefinition("productMapper");
		System.out.println("productMapperBd:"+productMapperBd.toString());
		productMapperBd.setBeanClass(ProductMapperFactoryBean.class);

	}
}
