package com.unimoni.custom.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 
 * @author gopi
 *
 */
public class SuffixValidator implements ConstraintValidator<Suffix, String> {

	private String prefix;

	@Override
	public void initialize(Suffix constraintAnnotation) {
		this.prefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value.startsWith(prefix)) {
			return true;
		}
		return false;
	}

}
