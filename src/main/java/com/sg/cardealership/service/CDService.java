package com.sg.cardealership.service;

import com.sg.cardealership.model.*;

import java.util.List;

import com.sg.cardealership.model.Cars;

import java.util.List;

public interface CDService
{
    List<Cars> getUsed();
    List<Cars> getNew();
    Cars getCarDetails(int carId);

    List<Cars> adminGetVehicles();
    Cars adminEditVehicle(int carId);
    Specials adminRemoveSpecials(int specialsId);
    Cars adminAddVehicle(Cars newCar);
    Make adminCreateMake(Make make);
    Model adminCreateModel(Model model);
    Specials adminAddSpecial(Specials special);
    List<Users> adminGetUsers();
    Users adminAddUser(Users user);
    Users adminGetUserById(int userId);

    List<Cars> getInventory();
    List<Sales> getSales();
}
