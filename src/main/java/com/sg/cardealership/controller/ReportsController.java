package com.sg.cardealership.controller;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Sales;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportsController
{
    @GetMapping("/inventory")
    public List<Cars> getInventory()
    {
        return null;
    }

    @GetMapping("/sales")
    public List<Sales> getSales()
    {
        return null;
    }

    @GetMapping("/index")
    public void getIndex()
    {

    }
}
