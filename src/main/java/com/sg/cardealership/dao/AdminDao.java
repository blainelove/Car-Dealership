package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Make;
import com.sg.cardealership.model.Model;
import com.sg.cardealership.model.Specials;

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
}
