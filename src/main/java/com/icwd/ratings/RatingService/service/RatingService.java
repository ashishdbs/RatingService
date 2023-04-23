package com.icwd.ratings.RatingService.service;

import com.icwd.ratings.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {

    // create
    Rating create(Rating rating);


    // get all ratings
    List<Rating> getAllRatings();

    // get all by userId
    List<Rating> getRatingByUserId(String userId);

    // get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
