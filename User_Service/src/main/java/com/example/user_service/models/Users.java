package com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Users extends BaseModel{
    @OneToOne
    Name name;
    String username;
    String password;
    String email;
    @ManyToOne
    Address address;
    String phone;


}
