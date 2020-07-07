package com.unimoni.custom.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SuffixValidator2 implements ConstraintValidator<Suffix2, String> {

	String name;

	@Override
	public void initialize(Suffix2 constraintAnnotation) {

		this.name = constraintAnnotation.value();

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value.startsWith(name)) {
			return true;
		}
		return false;
	}

}
