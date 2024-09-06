package com.karan.UserService.Controller;

import com.karan.UserService.Model.User;
import com.karan.UserService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<User>fetchAllUsers(){
        return userService.getAllUser();
    }
    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.FOUND)
    public User fetchUserById(@PathVariable Long userId){
        return userService.getUserBYId(userId);
    }
    @DeleteMapping()
    @ResponseStatus(HttpStatus.OK)
    public void deleteUsers(){
        userService.deleteUser();
    }
    @DeleteMapping("/userId")
    public void deleteUsersById(@PathVariable Long userId){
        userService.deleteUserById(userId);
    }

}
