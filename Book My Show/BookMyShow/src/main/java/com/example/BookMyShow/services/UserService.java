package com.example.BookMyShow.services;

import com.example.BookMyShow.models.User;
import com.example.BookMyShow.repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signup(String emailId, String password){
        Optional<User> optionalUser = UserRepository.findByEmail(emailId);

        //if user is present in DB call the login
        if(optionalUser.isPresent()){
            return login(emailId,password);
        }
        User user = new User();
        user.setEmail(emailId);
        // we have to encrypt password using Bcrypt to store in DB
        BCryptPasswordEncoder bCryptPasswordEncoder =new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(password));

        // save new user to DB
        return userRepository.save(user);
    }
    public boolean login(String emailId, String password){
        Optional<User> optionalUser = UserRepository.findByEmail(emailId);
        String passwordStoredInDB = optionalUser.get().getPassword();

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        return bCryptPasswordEncoder.matches(password,passwordStoredInDB);
    }
}

