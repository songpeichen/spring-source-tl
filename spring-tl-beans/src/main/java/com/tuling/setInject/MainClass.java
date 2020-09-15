package com.tuling.setInject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * Created by smlz on 2019/8/22.
 */
public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);


		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(ctx);


		InstA instA = (InstA) ctx.getBean("instA");

		System.out.println(instA);

	}
}
