/**
 * 
 */
package com.raidentrance.builder;

import java.util.Calendar;

import com.raidentrance.model.Person;

/**
 * @author alejandrobautista
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1988, 7, 19);
		Person p = new PersonBuilder().setName("Alex").setBirthDate(cal.getTime()).build();
		System.out.println(p);
	}

}
