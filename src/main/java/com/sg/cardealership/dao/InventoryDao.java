package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

public interface InventoryDao
{
    List<Cars> getUsed();
    List<Cars> getNew();
    Cars getCarDetails(int carId);
}
