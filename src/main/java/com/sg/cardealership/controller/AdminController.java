package com.sg.cardealership.controller;

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
    @GetMapping("/vehicles")
    public List<Cars> getVehicles()
    {
        return null;
    }

    @GetMapping("/editvehicle/{carId}")
    public Cars editVehicle(@PathVariable int carId)
    {
        return null;
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
        return null;
    }


    @PostMapping("/addvehicle")
    public Cars addVehicle(@RequestBody Cars newCar)
    {
        return null;
    }


    @PostMapping("/makes")
    public Make createMake(@RequestBody Make make)
    {
        return null;
    }

    @PostMapping("/models")
    public Model createModel(@RequestBody Model model)
    {
        return null;
    }

    @PostMapping("/addspecials")
    public Specials addSpecial(@RequestBody Specials special)
    {
        return null;
    }
}
