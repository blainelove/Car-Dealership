package com.sg.cardealership.dao;

import com.sg.cardealership.model.*;

import java.util.List;

public interface AdminDao
{
    List<Cars> getVehicles();

    Cars getCarById(int carId);

    Specials getSpecialById(int specialId);

    Cars addVehicle(Cars car);

    Make createMake(Make make);

    Model createModel(Model model);

    Specials addSpecial(Specials special);

    Specials removeSpecialById(int specialsId);

    List<Users> getUsers();

    Users addUser(Users user);

    Users getUserById(int userId);
}
