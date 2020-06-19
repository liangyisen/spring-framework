package com.yisen;

import com.yisen.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactroyPostProssesor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Person bean = beanFactory.getBean(Person.class);
		bean.setId(888888);
		System.out.println("postProcessBeanFactory " + bean);
	}
}
