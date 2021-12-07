package com.sg.cardealership.service;

import com.sg.cardealership.dao.InventoryDao;
import com.sg.cardealership.model.*;

import java.util.List;
import com.sg.cardealership.dao.AdminDao;
import com.sg.cardealership.dao.ReportsDao;
import com.sg.cardealership.model.Cars;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("database")
public class CDServiceImpl implements CDService
{   
    InventoryDao inventoryDao;
    AdminDao adminDao;
    ReportsDao reportsDao;
    public CDServiceImpl(InventoryDao invDao, AdminDao adminDao,ReportsDao reportsDao)
    {
        this.inventoryDao = invDao;
        this.adminDao = adminDao;
        this.reportsDao = reportsDao;
    }

    // -------------- Inventory Methods --------------
    @Override
    public List<Cars> getUsed()
    {
       return inventoryDao.getUsed();
    }
    @Override
    public List<Cars> getNew()
    {
       return inventoryDao.getNew();
    }
    @Override
    public Cars getCarDetails(int carId)
    {
       return inventoryDao.getCarDetails(carId);
    }

    // -------------- Admin Methods --------------
    @Override
    public Cars adminAddVehicle(Cars newCar)
    {
        return adminDao.addVehicle(newCar);
    }
    @Override
    public Cars adminEditVehicle(int carId)
    {
        return adminDao.getCarById(carId);
    }
    @Override
    public List<Cars> adminGetVehicles()
    {
        return adminDao.getVehicles();
    }
    @Override
    public Make adminCreateMake(Make make)
    {
        return adminDao.createMake(make);
    }
    @Override
    public Model adminCreateModel(Model model)
    {
        return adminDao.createModel(model);
    }
    @Override
    public Specials adminAddSpecial(Specials special)
    {
        return adminDao.addSpecial(special);
    }
    @Override
    public Specials adminRemoveSpecials(int specialsId)
    {
        return adminDao.removeSpecialById(specialsId);
    }
    @Override
    public List<Users> adminGetUsers()
    {
        return adminDao.getUsers();
    }
    @Override
    public Users adminAddUser(Users user)
    {
        return adminDao.addUser(user);
    }
    @Override
    public Users adminGetUserById(int userId)
    {
        return adminDao.getUserById(userId);
    }

    // -------------- Inventory Methods --------------
    @Override
    public List<Cars> getInventory() {
        
        return reportsDao.getInventory();
    }

    // -------------- Sales Methods --------------
    @Override
    public List<Sales> getSales() {
        
        return reportsDao.getSales();
    }
}
