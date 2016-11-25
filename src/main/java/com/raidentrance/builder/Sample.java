/**
 * 
 */
package com.raidentrance.builder;

import java.util.Calendar;

import com.raidentrance.model.Book;
import com.raidentrance.model.Person;

/**
 * @author raidentrance
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

		Book b = new BookBuilder().setAuthor("Kathy Sierra").setIsbn("0071591060")
				.setTitle("SCJP Sun Certified Programmer for Java 6 Exam 310-065").setPrice(26.11).build();
		System.out.println(b);
	}

}
