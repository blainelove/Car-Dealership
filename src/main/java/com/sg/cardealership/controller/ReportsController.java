package com.sg.cardealership.controller;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Sales;
import com.sg.cardealership.service.CDService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportsController
{
    private CDService service;

    public ReportsController(CDService service)
    {
        this.service = service;
    }
    @GetMapping("/inventory")
    public List<Cars> getInventory()
    {
       return service.getInventory();
    }

    @GetMapping("/sales")
    public List<Sales> getSales()
    {
        return service.getSales();
    }

    @GetMapping("/index")
    public void getIndex()
    {

    }
}
