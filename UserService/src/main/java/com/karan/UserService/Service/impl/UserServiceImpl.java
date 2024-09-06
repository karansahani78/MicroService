package com.karan.UserService.Service.impl;

import com.karan.UserService.Model.Hotel;
import com.karan.UserService.Model.User;
import com.karan.UserService.Repository.UserRepository;
import com.karan.UserService.Service.UserService;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserBYId(Long userId) {
        // fetching user by userId
        User user = userRepository.findById(userId).orElseThrow(()->new EntityNotFoundException("User not found for given id"+userId));
        // fetch rating of User(using http request or the get method to get userRating
        // http://localhost:8083/ratings/users/{userId}
       ArrayList forObject= restTemplate.getForObject("http://localhost:8083/ratings/users"+userId, ArrayList.class);
      // now for hotel so that it communicate with user
       ArrayList forHotels= restTemplate.getForObject("http://localhost:8082/ratings/hotels/{hotelId}",ArrayList.class);
        return user;
    }

    @Override
    public void deleteUser() {
        userRepository.deleteAll();
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
