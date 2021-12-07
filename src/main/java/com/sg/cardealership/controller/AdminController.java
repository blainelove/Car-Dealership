package com.sg.cardealership.controller;

import com.sg.cardealership.dao.AdminDao;
import com.sg.cardealership.model.*;
import com.sg.cardealership.service.CDService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController
{
//    private final AdminDao dao;
    private final CDService service;
    public AdminController(CDService service)
    {
        this.service = service;
    }

    @GetMapping("/vehicles")
    public List<Cars> getVehicles()
    {
        return service.adminGetVehicles();
    }

    @GetMapping("/editvehicle/{carId}")
    public Cars editVehicle(@PathVariable int carId)
    {
        return service.adminEditVehicle(carId);
    }

    @GetMapping("/users")
    public List<Users> getUsers()
    {
        return service.adminGetUsers();
    }

    @GetMapping("/adduser")
    public void addUser(@RequestBody Users user)
    {
        service.adminAddUser(user);
    }

    @GetMapping("/edituser")
    public void editUsers(@RequestBody int userId)
    {
        service.adminGetUserById(userId);
    }

    @GetMapping("/removespecials/{specialsId}")
    public Specials removeSpecials(@PathVariable int specialsId)
    {
        return service.adminRemoveSpecials(specialsId);
    }


    @PostMapping("/addvehicle")
    public Cars addVehicle(@RequestBody Cars newCar)
    {
        return service.adminAddVehicle(newCar);
    }

    @PostMapping("/makes")
    public Make createMake(@RequestBody Make make)
    {
        return service.adminCreateMake(make);
    }

    @PostMapping("/models")
    public Model createModel(@RequestBody Model model)
    {
        return service.adminCreateModel(model);
    }

    @PostMapping("/addspecials")
    public Specials addSpecial(@RequestBody Specials special)
    {
        return service.adminAddSpecial(special);
    }
}
