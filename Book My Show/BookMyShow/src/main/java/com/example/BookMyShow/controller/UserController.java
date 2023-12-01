package com.example.BookMyShow.controller;

import com.example.BookMyShow.DTO.SignupRequestDTO;
import com.example.BookMyShow.DTO.SignupResponseDTO;
import com.example.BookMyShow.models.ResponseStatus;
import com.example.BookMyShow.models.User;
import com.example.BookMyShow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }
    public SignupResponseDTO singnUp(SignupRequestDTO signupRequestDTO){
        SignupResponseDTO signupResponseDTO = new SignupResponseDTO();

        try {
            User user = userService.signup(signupRequestDTO.getEmailId(), signupRequestDTO.getPassword());

            signupResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            signupResponseDTO.setUserid(user.getId());
        }
        catch (Exception e){
                signupResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
                signupResponseDTO.setUserid(-1L);
        }

        return signupResponseDTO;
    }
}
