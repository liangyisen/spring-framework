package com;


import com.yisen.AppConfig;
import com.yisen.bean.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestClass {

	@Test
	public void ersfg() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Person bean1 = context.getBean(Person.class);

		Person bean = context.getBean(Person.class);
		System.out.println("person = " + bean1);
		System.out.println("bean = " + bean);
	}
}