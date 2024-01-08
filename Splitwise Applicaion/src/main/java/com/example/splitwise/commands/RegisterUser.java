package com.example.splitwise.commands;

import com.example.splitwise.DTO.SettleUpUserRequestDto;
import com.example.splitwise.controller.SettleUpController;

import java.util.List;

public class RegisterUser implements Command{
    @Override
    public boolean matches(String input) {


        return false;
    }

    @Override
    public void execute(String input) {


    }
}
