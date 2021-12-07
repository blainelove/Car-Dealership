package com.sg.cardealership.controller;

import com.sg.cardealership.dao.AdminDao;
import com.sg.cardealership.dao.HomeDao;
import com.sg.cardealership.model.CustomerContact;
import com.sg.cardealership.model.Specials;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController
{
    
    private final HomeDao dao;
    public HomeController(HomeDao dao)
    {
        this.dao = dao;
    }
    
    @GetMapping("/index")
    public void getIndex()
    {
        dao.getFeaturedCars();
    }

    @GetMapping("/specials")
    public List<Specials> getSpecials()
    {
        return dao.getSpecials();
    }


    @PostMapping("/contact")
    public CustomerContact contact(@RequestBody CustomerContact contact)
    {
        return dao.addContact(contact);
    }


}
