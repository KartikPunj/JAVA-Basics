package com.example.BookMyShow.repositories;

import com.example.BookMyShow.models.Show;
import com.example.BookMyShow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long> {
    @Override
    List<Show> findAllById(Iterable<Long> showid);


    ShowSeat save(ShowSeat showSeat);
}
