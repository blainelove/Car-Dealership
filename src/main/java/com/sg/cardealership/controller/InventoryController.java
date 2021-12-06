package com.sg.cardealership.controller;

import com.sg.cardealership.model.Cars;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController
{
    @GetMapping("/used")
    public List<Cars> getUsed()
    {
        return null;
    }

    @GetMapping("/new")
    public List<Cars> getNew()
    {
        return null;
    }

    @GetMapping("/details/{carId}")
    public Cars getCarDetails(@PathVariable int carId)
    {
        return null;
    }
}
