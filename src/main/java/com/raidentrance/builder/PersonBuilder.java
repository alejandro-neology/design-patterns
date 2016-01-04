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
		Preconditions.checkNotNull(instance.getName());
		Preconditions.checkNotNull(instance.getBirthDate());
		Preconditions.checkNotNull(instance.getAge());
	}

	@Override
	public void inject() {
		Preconditions.checkNotNull(instance.getBirthDate(),
				new BussinessException(ErrorResult.EMPTRY_RESULT.getMessage()));
		instance.setAge(TimeHelper.getAge(instance.getBirthDate()));
	}

}
