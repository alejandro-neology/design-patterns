/**
 * 
 */
package com.raidentrance.commons;

import java.util.Calendar;
import java.util.Date;

/**
 * @author raidentrance
 *
 */
public class TimeHelper {
	public static int getAge(Date birthDate) {
		Calendar dob = Calendar.getInstance();
		dob.setTime(birthDate);
		Calendar today = Calendar.getInstance();
		int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
		if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
			age--;
		} else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
				&& today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
			age--;
		}
		return age;
	}

}
