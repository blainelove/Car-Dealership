package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.CustomerContact;
import com.sg.cardealership.model.Specials;

import java.util.List;

public interface HomeDao
{
    List<Cars> getFeaturedCars();
    CustomerContact addContact(CustomerContact contact);
    List<Specials> getSpecials();
}
