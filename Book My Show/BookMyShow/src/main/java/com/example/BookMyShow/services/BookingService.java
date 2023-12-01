package com.example.BookMyShow.services;

import com.example.BookMyShow.exceptions.InvalidUserException;
import com.example.BookMyShow.exceptions.ShowSeatNotAvailable;
import com.example.BookMyShow.models.*;
import com.example.BookMyShow.repositories.ShowRepository;
import com.example.BookMyShow.repositories.ShowSeatRepository;
import com.example.BookMyShow.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private PriceCalculator priceCalculator;

    @Autowired
    public BookingService(UserRepository userRepository, ShowRepository showRepository, ShowSeatRepository showSeatRepository,PriceCalculator priceCalculator) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.priceCalculator = priceCalculator;
    }
    @Transactional(isolation= Isolation.SERIALIZABLE)
    public Booking bookMovie(Long userId, Long showId, List<Long> showSeatIds ) throws InvalidUserException, ShowSeatNotAvailable {
        // actual business logic will come here
        //steps:-
        //---------Take a lock here to amke it easy
        //1. get user object from userid.
        //2. get show object with showId.
        //3. get showseats with showseatId.
        //-------Take a Lock(approach 2)---------
        //4. check if seats are available or not.
        //5. if no, throw an exception.
        //6. if Yes, mark the seat status as BLOCKED.
        //7. save the updated status in DB
        //-----------Release The Lock(approach 2)----------
        //8. create the booking object with PENDING Status.
        //9. return the booking object.
        //------------release lock(approach 1)----------

        //1. get user object from userid.
        Optional<User> optionalUser =userRepository.findById(userId);
        if(optionalUser.isEmpty()) throw new InvalidUserException("Invalid User");

        User user = optionalUser.get();

        //2. get show object with showId.
        Optional<Show> optionalShow = showRepository.findById(showId);

        if(optionalShow.isEmpty()){
            throw new InvalidUserException("Invalid Show");
        }

        Show show = optionalShow.get();

        //3. get showseats with showseatId.
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);

        //4. check if seats are available or not.
        for(ShowSeat showSeat :showSeats){
                        if(showSeat.getSeatStatus().equals(SeatStatus.UNAVAILABLE)){
                            //5. if no, throw an exception.
                            throw new ShowSeatNotAvailable("Seat not available");
                        }
        }

        for(ShowSeat showSeat: showSeats){
            //6. if Yes, mark the seat status as BLOCKED.
            showSeat.setSeatStatus(SeatStatus.BLOCKED);
            //7. save the updated status in DB
            showRepository.save(showSeat);

        }

        //8. create the booking object with PENDING Status.
        Booking booking = new Booking();
        booking.setBookingStatus(BookingStatus.PENDING);
        booking.setTimeOfBooking(new Date());
        booking.setShow(show);
        booking.setUser(user);
        booking.setShowSeats(showSeats);
        booking.setPayments(new ArrayList<>());
        booking.setPrice(priceCalculator.CalculatePrice(show,showSeats));

        return booking;

    }
}
