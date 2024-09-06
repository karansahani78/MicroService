package com.karan.UserService.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    private Long ratingId;
    private Long userId;
    private String hotelId;
    private Integer rating;
    private String feedback;
    private Hotel hotel;
}
