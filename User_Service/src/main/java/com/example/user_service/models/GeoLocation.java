package com.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class GeoLocation extends BaseModel{
    Double lat;
    Double lng;
}
