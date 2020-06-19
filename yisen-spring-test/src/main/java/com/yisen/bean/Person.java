package com.yisen.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Component
@Scope(SCOPE_PROTOTYPE)
public class Person {

	@PostConstruct
	public void post() {
		System.out.println("初始化"+this.hashCode());
		Random random = new Random();
		setId(random.nextInt(10));
		System.out.println(getId());
	}
	@PreDestroy
	private void perDestroy() {
		System.out.println("perDestroy");
	}

	private int id;
	private String name;
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {

		return "Person{" + "id=" + id + ", name='" + name + '\'' + ", school='" + school + '\'' + '}';
	}

}
