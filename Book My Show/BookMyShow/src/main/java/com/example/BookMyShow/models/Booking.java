package com.example.BookMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Booking extends BaseModel{
    @ManyToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    @CreatedBy
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
