package com.rating.RatingService.services;

import com.rating.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {

    public Rating createRating(Rating rating);
    public List<Rating> getAllRating();
    public List<Rating> getRatingByUserId(String userId);
    public List<Rating> getRatingByHotelId(String hotelId);
}
