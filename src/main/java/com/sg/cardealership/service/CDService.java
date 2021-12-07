package com.sg.cardealership.service;

import com.sg.cardealership.model.Cars;
import java.util.List;

public interface CDService
{
    List<Cars> getUsed();
    List<Cars> getNew();
    Cars getCarDetails(int carId);
}
