package com.example.BookMyShow.repositories;

import com.example.BookMyShow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


    @Override
    Optional<User> findById(Long userId); // finding the user using the userId. No need to write whole SQL query


    Optional<User> findByEmail(String emailId);
    @Override
    User save(User user);

}

/*
To create any repository use 2 steps
1. make repository interface
2. Repository interface extends the JPARepository Interface
 */
