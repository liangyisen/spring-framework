package com.yisen;

import com.yisen.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan("com.yisen")
public class BeanFactroyPostProsseConfig implements ApplicationContextAware {

	private AbstractApplicationContext abstractApplicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.abstractApplicationContext = (AbstractApplicationContext) applicationContext;

	 ((AbstractApplicationContext) applicationContext).addBeanFactoryPostProcessor(getMyBeanFactroyPostProssesor());
	}


	@Bean
	public MyBeanFactroyPostProssesor getMyBeanFactroyPostProssesor() {
		MyBeanFactroyPostProssesor myBeanFactroyPostProssesor = new MyBeanFactroyPostProssesor();
		return myBeanFactroyPostProssesor;
	}


}
