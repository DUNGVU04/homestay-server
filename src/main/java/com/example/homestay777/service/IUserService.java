package com.example.homestay777.service;

import com.example.homestay777.model.UserHotel;

import java.util.List;

/**
 * @author Simpson Alfred
 */

public interface IUserService {
    UserHotel registerUser(UserHotel user);
    List<UserHotel> getUsers();
    void deleteUser(String email);
    UserHotel getUser(String email);
}
