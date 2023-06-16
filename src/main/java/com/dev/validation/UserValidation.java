package com.dev.validation;

import com.dev.dto.UserDto;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.Valid;

public class UserValidation implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return UserDto.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "message.firstName", "First name is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "message.lastName", "Last name is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "message.password", "Password is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "message.username", "userName is required");
    }
}
