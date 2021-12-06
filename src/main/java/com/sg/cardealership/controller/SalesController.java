package com.sg.cardealership.controller;

import com.sg.cardealership.model.Sales;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController
{
    @GetMapping("/index")
    public List<Sales> getIndex()
    {
        return null;
    }

    @GetMapping("/purchase/{purchaseId}")
    public Sales getPurchaseById(@PathVariable int purchaseId)
    {
        return null;
    }
}
