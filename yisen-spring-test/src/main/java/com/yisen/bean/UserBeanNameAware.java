package com.yisen.bean;

import org.springframework.beans.factory.BeanNameAware;

public class UserBeanNameAware implements BeanNameAware {
	@Override
	public void setBeanName(String name) {
		System.out.println("name = " + name);
	}
}
