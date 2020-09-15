package com.mybatis.v3.compent;

import com.mybatis.v2.factorybean.TulingMapperFactorybean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Set;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/5/5 15:12
 */
public class TulingMapperRegister implements BeanDefinitionRegistryPostProcessor {

	private String basePackage;

	private static Class targetClass = TulingMapperFactorybean.class;


	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		//扫描bean定义
		TulingClassPathMapperScanner mapperScanner = new TulingClassPathMapperScanner(registry);

		mapperScanner.addIncludeFilter(new TypeFilter() {
			@Override
			public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
				return true;
			}
		});


		Set<BeanDefinitionHolder> scannedBds =  mapperScanner.doScan(this.basePackage);

		for (BeanDefinitionHolder bdh:scannedBds) {

			GenericBeanDefinition beanDefinition = (GenericBeanDefinition) bdh.getBeanDefinition();
			String  sourceClass = beanDefinition.getBeanClassName();
			System.out.println("原生接口的class类型:"+sourceClass);
			beanDefinition.setBeanClass(targetClass);
			beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(sourceClass);
		}

		System.out.println(scannedBds);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException, ClassNotFoundException {

	}
}
