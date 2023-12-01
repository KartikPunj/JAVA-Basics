package com.example.BookMyShow.repositories;

import com.example.BookMyShow.models.Show;
import com.example.BookMyShow.models.Show_SeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShowSeatTypeRepository extends JpaRepository<Show_SeatType,Long> {


    List<Show_SeatType> findAllByShow(Show show);
}
