package com.karan.UserService.Service;

import com.karan.UserService.Model.User;
import java.util.List;

public interface UserService {
    // to create user(note=interface does not have body)
    User createUser(User user);
    // get user
    List<User>getAllUser();
    // get user by id
    User getUserBYId(Long userId);

    // delete Use
    void deleteUser();
    // delete User By id
    void deleteUserById(Long userId);

}
