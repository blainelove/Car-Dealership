package com.sg.cardealership.service;

import com.sg.cardealership.dao.InventoryDao;
import com.sg.cardealership.model.Cars;
import java.util.List;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("database")
public class CDServiceImpl implements CDService
{   
    InventoryDao dao;
    
    public CDServiceImpl(InventoryDao invDao) {
        this.dao = invDao;
    }
    @Override
    public List<Cars> getUsed() {
       return dao.getUsed();
    }
    @Override
    public List<Cars> getNew() {
       return dao.getNew();
    }
    @Override
    public Cars getCarDetails(int carId) {
       return dao.getCarDetails(carId);
    }
}
