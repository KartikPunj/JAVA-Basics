package com.example.BookMyShow.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookMovieRequestDto {
    private Long userid;
    private Long showid;
    private List<Long> showSeatId;
}
