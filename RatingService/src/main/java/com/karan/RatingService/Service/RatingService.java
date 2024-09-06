package com.karan.RatingService.Service;

import com.karan.RatingService.Model.Rating;

import java.util.List;
import java.util.Optional;

public interface RatingService {
    // create Rating
    Rating createRating(Rating rating);
    // get Rating by userId
    Rating getRatingById(Long userId);
    // get Rating by hotelId
    List<Rating>getRatingById(String hotelId);
    // ge All Ratings
    List<Rating>findAllRatings();
}
