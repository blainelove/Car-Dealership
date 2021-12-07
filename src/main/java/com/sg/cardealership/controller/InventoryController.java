package com.sg.cardealership.controller;

import com.sg.cardealership.dao.InventoryDao;
import com.sg.cardealership.model.Cars;
import com.sg.cardealership.service.CDService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController{
    
    
    private CDService service;

    public InventoryController(CDService service) {
        
        this.service = service;
    }
    @GetMapping("/used")
    public List<Cars> getUsed()
    {
        return service.getUsed();
    }

    @GetMapping("/new")
    public List<Cars> getNew()
    {
        return service.getNew();
    }

    @GetMapping("/details/{carId}")
    public Cars getCarDetails(@PathVariable int carId)
    {
        return service.getCarDetails(carId);
    }
}
