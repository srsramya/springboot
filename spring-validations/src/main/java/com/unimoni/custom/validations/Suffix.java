package com.unimoni.custom.validations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 
 * @author gopi
 *
 */
@Documented
@Constraint(validatedBy = { SuffixValidator.class })
@Target({ FIELD })
@Retention(RUNTIME)
public @interface Suffix {

	String message() default "Please give the correct suffix";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String value() default "WL";

}
