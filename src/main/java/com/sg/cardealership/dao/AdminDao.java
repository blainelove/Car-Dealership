package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;

import java.util.List;

public interface AdminDao
{
    List<Cars> getVehicles();

    Cars getCarById(int carId);
}
