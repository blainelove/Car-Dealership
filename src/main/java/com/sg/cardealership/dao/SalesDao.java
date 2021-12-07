package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Sales;

import java.util.List;

public interface SalesDao
{
    List<Cars> getNotSoldCars();
    Sales addSales(Sales sale);
}
