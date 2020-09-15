package com.mybatis.v1.factorybean;

import com.mybatis.v1.anno.TulingSelect;
import com.mybatis.v1.dao.AccountMapper;
import com.mybatis.v1.entity.AccountInfo;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/5/5 13:43
 */
public class AccountMapperFactoryBean implements FactoryBean {

	@Nullable
	@Override
	public AccountMapper getObject() throws Exception {


		return (AccountMapper) Proxy.newProxyInstance(AccountMapper.class.getClassLoader(),new Class[]{AccountMapper.class},new AccountMapperProxy());

	}

	@Nullable
	@Override
	public Class<?> getObjectType() {
		return AccountMapper.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}

class AccountMapperProxy implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//处理Object原生的方法
		if(method.getDeclaringClass().equals(Object.class)) {
			return method.invoke(this, args);
		}

		TulingSelect tulingSelect = method.getAnnotation(TulingSelect.class);
		String parseSql = tulingSelect.value();
		System.out.println("解析业务sql:"+parseSql+"入参:"+Arrays.asList(args));

		//模拟查询数据库返回
		Class returnType = method.getReturnType();
		AccountInfo accountInfo = (AccountInfo) returnType.newInstance();

		accountInfo.setAccoutId("111111111");
		accountInfo.setBlance(9999);
		accountInfo.setId(1);
		return accountInfo;
	}
}
