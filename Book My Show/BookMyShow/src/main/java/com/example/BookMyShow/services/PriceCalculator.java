package com.example.BookMyShow.services;

import com.example.BookMyShow.models.Show;
import com.example.BookMyShow.models.ShowSeat;
import com.example.BookMyShow.models.Show_SeatType;
import com.example.BookMyShow.repositories.ShowSeatTypeRepository;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class PriceCalculator {

    private PriceCalculator priceCalculator;
    private ShowSeatTypeRepository showSeatTypeRepository;

    @Autowired
    PriceCalculator(ShowSeatTypeRepository showSeatTypeRepository){
        this.showSeatTypeRepository=showSeatTypeRepository;
    }
    public int CalculatePrice(Show show, List<ShowSeat> showSeats){
        //1.Get the show Seat type for a given show
        List<Show_SeatType> show_seatTypes = showSeatTypeRepository.findAllByShow(show);
        //2. Get the type of input showseats
        int amount =0;
        for(ShowSeat showSeat: showSeats){
            for(Show_SeatType show_seatType: show_seatTypes){
                if(showSeat.getSeat().getSeatType().equals(show_seatType.getSeatType()))
                    amount += show_seatType.getPrice();
                break;
            }
        }
        //3.Add the Corresponding Table

        return amount;
    }
}
