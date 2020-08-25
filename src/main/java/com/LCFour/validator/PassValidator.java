package com.LCFour.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PassValidator implements ConstraintValidator<Pass, String>{

	@Override
	public void initialize(Pass constraintAnnotation) {}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value.equals(null))
			return false;
		else
			return true;
	}
}