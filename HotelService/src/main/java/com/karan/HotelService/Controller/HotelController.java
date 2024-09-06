package com.karan.HotelService.Controller;

import com.karan.HotelService.Model.Hotel;
import com.karan.HotelService.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @PostMapping()
    public Hotel saveHotel(@RequestBody Hotel hotel){
        return hotelService.createHotel(hotel);
    }
    @GetMapping()
    public List<Hotel>getAllHotels(){
        return hotelService.getHotels();
    }
    @GetMapping("/{hotelId}")
    public Optional<Hotel>getHotelsById(@PathVariable String hotelId){
        return hotelService.getHotelById(hotelId);
    }
    @DeleteMapping()
    public void deleteHotels(){
        hotelService.deleteHotels();
    }
    @DeleteMapping("/{hotelId}")
    public void deleteHotelsById(@PathVariable String hotelId){
        hotelService.deleteHotelsById(hotelId);
    }
}
