package com.karan.HotelService.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotelDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    @Id
    private String hotelId;
    private String name;
    private String location;
    private String about;


}
