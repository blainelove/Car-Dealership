package com.sg.cardealership.controller;

import com.sg.cardealership.dao.AdminDao;
import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Make;
import com.sg.cardealership.model.Model;
import com.sg.cardealership.model.Specials;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController
{
    private final AdminDao dao;
    public AdminController(AdminDao dao)
    {
        this.dao = dao;
    }

    @GetMapping("/vehicles")
    public List<Cars> getVehicles()
    {
        return dao.getVehicles();
    }

    @GetMapping("/editvehicle/{carId}")
    public Cars editVehicle(@PathVariable int carId)
    {
        return dao.getCarById(carId);
    }

    @GetMapping("/users")
    public void getUsers()
    {

    }

    @GetMapping("/adduser")
    public void addUser()
    {
    }

    @GetMapping("/edituser")
    public void editUsers()
    {

    }

    @GetMapping("/removespecials/{specialsId}")
    public Specials removeSpecials(@PathVariable int specialsId)
    {
        return dao.removeSpecialById(specialsId);
    }


    @PostMapping("/addvehicle")
    public Cars addVehicle(@RequestBody Cars newCar)
    {
        return dao.addVehicle(newCar);
    }

    @PostMapping("/makes")
    public Make createMake(@RequestBody Make make)
    {
        return dao.createMake(make);
    }

    @PostMapping("/models")
    public Model createModel(@RequestBody Model model)
    {
        return dao.createModel(model);
    }

    @PostMapping("/addspecials")
    public Specials addSpecial(@RequestBody Specials special)
    {
        return dao.addSpecial(special);
    }
}
