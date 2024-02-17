package com.taha.weather.controller.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class CityNameValidator implements ConstraintValidator<CityNameConstraint, String> {
    @Override
    public void initialize(CityNameConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        //Ankara-Istanbul-Izmır - işaretlerini silip birleştircek
        value = value.replaceAll("[^a-zA-Z0-9]","");
        return !StringUtils.isNumeric(value) && !StringUtils.isBlank(value);

    }
}
