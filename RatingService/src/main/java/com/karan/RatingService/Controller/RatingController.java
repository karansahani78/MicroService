package com.karan.RatingService.Controller;

import com.karan.RatingService.Model.Rating;
import com.karan.RatingService.Service.RatingService;
import org.aspectj.weaver.ast.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;
    @PostMapping()
    public Rating createRatings( Rating rating){
        return ratingService.createRating(rating);
    }
    @GetMapping("/users/{userId}")
    public Rating getRatingsById(@PathVariable Long userId){
        return ratingService.getRatingById(userId);
    }
    @GetMapping("/hotels/{hotelId}")
   public List<Rating> getRatingsById(@PathVariable String hotelId){
        return ratingService.getRatingById(hotelId);
    }
    @GetMapping()
    public List<Rating>getAllRatings(){
        return ratingService.findAllRatings();
    }
}
