package com.pacemaker.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.pacemaker.validation.implementation.ValidName_impl;




@Documented
@Constraint(validatedBy = ValidName_impl.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidName {
	
	String message() default "Digits and Special characters are not allowed";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
