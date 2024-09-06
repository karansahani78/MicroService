package com.karan.RatingService.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ratings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ratingId;
    private Long userId;
    private String hotelId;
    private Integer rating;
    private String feedback;
}
