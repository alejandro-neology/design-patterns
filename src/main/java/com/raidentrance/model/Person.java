/**
 * 
 */
package com.raidentrance.model;

import java.util.Date;

/**
 * @author alejandrobautista
 *
 */
public class Person {
	private String name;
	private Date birthDate;
	private int age;

	public Person() {
	}

	public Person(String name, Date birthDate, int age) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDate=" + birthDate + ", age=" + age + "]";
	}

}
