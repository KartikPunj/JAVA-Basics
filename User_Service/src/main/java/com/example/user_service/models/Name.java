package com.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Name extends BaseModel{
    String firstName;
    String lastName;
}
