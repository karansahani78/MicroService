package com.karan.HotelService.Service;

import com.karan.HotelService.Model.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {
    Hotel createHotel(Hotel hotel);
    List<Hotel>getHotels();
    Optional<Hotel>getHotelById(String hotelId);
    void deleteHotels();
    void deleteHotelsById(String hotelId);
}
