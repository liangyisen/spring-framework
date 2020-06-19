package com.yisen;


import com.yisen.bean.Computer;
import com.yisen.bean.Person;
import com.yisen.bean.UserBeanNameAware;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	@Test
	public void annotationConfigApplicationContext() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Person bean1 = context.getBean(Person.class);

		Computer bean = context.getBean(Computer.class);
		System.out.println("person = " + bean1);
		System.out.println("bean = " + bean);
	}


	@Test
	public void xml() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath*:Spring-bean.xml");
		Person bean = classPathXmlApplicationContext.getBean(Person.class);
		System.out.println("bean = " + bean);
	}

	@Test
	public void testAware() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath*:Spring-bean.xml");
		Person bean = classPathXmlApplicationContext.getBean(Person.class);
		System.out.println("bean = " + bean);
		UserBeanNameAware userBeanNameAware = classPathXmlApplicationContext.getBean(UserBeanNameAware.class);
		System.out.println("userBeanNameAware = " + userBeanNameAware);
	}

	@Test
	public void beanFactroyPostProcessors() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanFactroyPostProsseConfig.class);
		Person bean = annotationConfigApplicationContext.getBean(Person.class);
		System.out.println(bean);
	}

	@Test
	public void testBeanUtils() {
		Person person = BeanUtils.instantiateClass(Person.class);
		System.out.println("person = " + person);
	}

}