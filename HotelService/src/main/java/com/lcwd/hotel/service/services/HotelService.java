package com.lcwd.hotel.service.services;

import com.lcwd.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {

    public Hotel createHotel(Hotel hotel);
    public List<Hotel> getAllHotels();
    public Hotel getHotelById(String hotelId);
    public void deleteHotel(String hotelId);
}
