package com.sg.cardealership.controller;

import com.sg.cardealership.dao.AdminDao;
import com.sg.cardealership.dao.SalesDao;
import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Sales;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController
{
    private final SalesDao dao;
    public SalesController(SalesDao dao)
    {
        this.dao = dao;
    }

    @GetMapping("/index")
    public List<Cars> getIndex()
    {
        return dao.getNotSoldCars();
    }

    @PostMapping("/purchase/Id")
    public Sales getPurchaseById(@RequestBody Sales sale)
    {
        return dao.addSales(sale);
    }
}
