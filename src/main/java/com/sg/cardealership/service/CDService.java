package com.sg.cardealership.service;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Make;
import com.sg.cardealership.model.Model;
import com.sg.cardealership.model.Specials;

import java.util.List;

public interface CDService
{
    List<Cars> adminGetVehicles();

    Cars adminEditVehicle(int carId);

    Specials adminRemoveSpecials(int specialsId);

    Cars adminAddVehicle(Cars newCar);

    Make adminCreateMake(Make make);

    Model adminCreateModel(Model model);

    Specials adminAddSpecial(Specials special);
}
