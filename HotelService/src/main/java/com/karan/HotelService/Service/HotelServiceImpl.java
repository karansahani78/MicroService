package com.karan.HotelService.Service;

import com.karan.HotelService.Model.Hotel;
import com.karan.HotelService.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> getHotelById(String hotelId){
            return hotelRepository.findById(hotelId);
    }

    @Override
    public void deleteHotels() {
        hotelRepository.deleteAll();

    }

    @Override
    public void deleteHotelsById(String hotelId) {
        hotelRepository.deleteById(hotelId);

    }
}