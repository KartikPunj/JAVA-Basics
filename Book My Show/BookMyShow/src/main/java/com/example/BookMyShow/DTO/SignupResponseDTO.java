package com.example.BookMyShow.DTO;

import com.example.BookMyShow.models.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupResponseDTO {

    private ResponseStatus responseStatus;
    private Long userid;
}
