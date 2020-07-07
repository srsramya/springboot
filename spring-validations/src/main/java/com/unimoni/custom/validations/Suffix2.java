package com.unimoni.custom.validations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Min.List;

@Target({ FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {SuffixValidator2.class})
public @interface Suffix2 {

	String message() default "Please give correct suffix";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	String value() default "";
	
}
