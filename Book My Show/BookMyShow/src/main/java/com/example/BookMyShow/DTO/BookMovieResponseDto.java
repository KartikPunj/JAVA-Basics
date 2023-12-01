package com.example.BookMyShow.DTO;

import com.example.BookMyShow.models.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDto {
    private int amount;
    private Long bookingId;
    private ResponseStatus responseStatus;
}
