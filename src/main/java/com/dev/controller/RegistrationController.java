package com.dev.controller;

import com.dev.dto.UserDto;
import org.springframework.ui.Model;
import org.springframework.web.context.request.WebRequest;

public class RegistrationController {


    public String showRegistrationForm(WebRequest request, Model model){
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }
}
