package com.mybatis.v2.anno;

import com.mybatis.v2.compent.TulingImportBeanDefinitionRegister;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/5/5 14:20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(value = TulingImportBeanDefinitionRegister.class)
public @interface EnableMapperScanner {

	String basePackage();

}
