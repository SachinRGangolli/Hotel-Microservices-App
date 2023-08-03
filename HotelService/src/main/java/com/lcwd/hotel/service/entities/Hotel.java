package com.lcwd.hotel.service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotels")
public class Hotel {

    @Id
    private String hotelId;
    private String name;
    private String address;
    private String phone;
    @Lob
    @Column(length = 100000)
    private String about;

}
