package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.entity.User;

public interface UserService {
    List<User> searchUsers(String query);

    List<User> UserLogin(String USER_ID, String PassWord);

    User createUser(User user);
}
