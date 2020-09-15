package com.mybatis.v3.compent;

import com.mybatis.v2.anno.EnableMapperScanner;
import com.mybatis.v2.factorybean.TulingMapperFactorybean;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
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
 * @date 2020/5/5 14:29
 */
public class TulingImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {


	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		AnnotationAttributes attributes = (AnnotationAttributes) importingClassMetadata.getAnnotationAttributes(EnableMapperScanner.class.getName());

		//配置了EnableMapperScanner 注解
		if(attributes ==null) {
			return;
		}

		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(TulingMapperRegister.class);

		beanDefinitionBuilder.addPropertyValue("basePackage",attributes.getString("basePackage"));

		registry.registerBeanDefinition(TulingMapperRegister.class.getName(),beanDefinitionBuilder.getBeanDefinition());

	}
}
