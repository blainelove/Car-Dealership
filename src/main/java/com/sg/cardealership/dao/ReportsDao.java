package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.PurchaseLog;
import java.util.List;

public interface ReportsDao
{
    List<Cars> getInventory();
//    List<PurchaseLog> getSales();
}
