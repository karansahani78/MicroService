package com.karan.RatingService.Repository;

import com.karan.RatingService.Model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,Long> {
    List<Rating>findByHotelId(String hotelId);
}
