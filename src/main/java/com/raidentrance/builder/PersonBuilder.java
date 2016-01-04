/**
 * 
 */
package com.raidentrance.builder;

import java.util.Date;

import com.google.common.base.Preconditions;
import com.raidentrance.builder.commons.AbstractBuilder;
import com.raidentrance.commons.ErrorResult;
import com.raidentrance.commons.TimeHelper;
import com.raidentrance.model.BussinessException;
import com.raidentrance.model.Person;

/**
 * @author alejandrobautista
 *
 */
public class PersonBuilder extends AbstractBuilder<Person> {

	public PersonBuilder() {
		super(new Person());
	}

	public PersonBuilder setName(String name) {
		instance.setName(name);
		return this;
	}

	public PersonBuilder setBirthDate(Date birthDate) {
		instance.setBirthDate(birthDate);
		return this;
	}

	@Override
	public void validate() {
		Preconditions.checkNotNull(instance.getName(),
				new BussinessException(String.format(ErrorResult.EMPTRY_RESULT.getMessage(), "Name")));
		Preconditions.checkNotNull(instance.getBirthDate(),
				new BussinessException(String.format(ErrorResult.EMPTRY_RESULT.getMessage(), "Birth date")));
		Preconditions.checkNotNull(instance.getAge(),
				new BussinessException(String.format(ErrorResult.EMPTRY_RESULT.getMessage(), "Age")));
	}

	@Override
	public void inject() {
		Preconditions.checkNotNull(instance.getBirthDate(),
				new BussinessException(String.format(ErrorResult.EMPTRY_RESULT.getMessage(), "Birth date")));
		instance.setAge(TimeHelper.getAge(instance.getBirthDate()));
	}

}
