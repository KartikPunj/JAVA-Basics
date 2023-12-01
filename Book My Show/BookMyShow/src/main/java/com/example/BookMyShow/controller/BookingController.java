package com.example.BookMyShow.controller;

import com.example.BookMyShow.DTO.BookMovieRequestDto;
import com.example.BookMyShow.DTO.BookMovieResponseDto;
import com.example.BookMyShow.models.Booking;
import com.example.BookMyShow.models.ResponseStatus;
import com.example.BookMyShow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller //given a cmd to springboot that in future i need object of this class so create one and store somewhere
public class BookingController {

      private BookingService bookingService;
      @Autowired // it means pass the object that has been already created by spring inside the below-mentioned constructor
      BookingController(BookingService bookingService){
            this.bookingService=bookingService;
      }
      BookMovieResponseDto bookMovie(BookMovieRequestDto bookMovieRequestDto){
            BookMovieResponseDto bookMovieResponseDto = new BookMovieResponseDto();
            try {
                  Booking booking = bookingService.bookMovie(
                          bookMovieRequestDto.getUserid(),
                          bookMovieRequestDto.getShowid(),
                          bookMovieRequestDto.getShowSeatId());
                  bookMovieResponseDto.setBookingId(booking.getId());
                  bookMovieResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
                  bookMovieResponseDto.setAmount(booking.getPrice());
            }
            catch (Exception e){
                  bookMovieResponseDto.setResponseStatus(ResponseStatus.FAILURE);
            }
            return bookMovieResponseDto;
      }
}
