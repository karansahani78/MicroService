package com.karan.RatingService.Service;

import com.karan.RatingService.Model.Rating;
import com.karan.RatingService.Repository.RatingRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public Rating getRatingById(Long userId) {
        return ratingRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("Rating not found for given userId" + userId));
    }

    @Override
    public List<Rating> getRatingById(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);

    }

    @Override
    public List<Rating> findAllRatings() {
        return ratingRepository.findAll();
    }
}
