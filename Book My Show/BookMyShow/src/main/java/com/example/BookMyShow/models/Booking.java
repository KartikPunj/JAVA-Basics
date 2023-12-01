package com.example.BookMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    @ManyToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private User user;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<Payment> payments;
    private int price;
    private Date timeOfBooking;
}
