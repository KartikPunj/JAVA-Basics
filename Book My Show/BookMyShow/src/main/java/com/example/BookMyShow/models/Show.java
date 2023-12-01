package com.example.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity (name = "shows")
public class Show extends BaseModel{
    private String name;
    @ManyToOne
    private Movie movie;
    private String language;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Screen screen;
}
