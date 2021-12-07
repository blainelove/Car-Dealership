package com.sg.cardealership.service;

import com.sg.cardealership.dao.AdminDao;
import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Make;
import com.sg.cardealership.model.Model;
import com.sg.cardealership.model.Specials;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("database")
public class CDServiceImpl implements CDService
{
    AdminDao adminDao;

    public CDServiceImpl(AdminDao adminDao)
    {
        this.adminDao = adminDao;
    }

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
}
