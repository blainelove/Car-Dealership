package com.sg.cardealership.controller;

import com.sg.cardealership.model.CustomerContact;
import com.sg.cardealership.model.Specials;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController
{
    @GetMapping("/index")
    public void getIndex()
    {

    }

    @GetMapping("/specials")
    public List<Specials> getSpecials()
    {
        return null;
    }


    @PostMapping("/contact")
    public CustomerContact contact(@RequestBody CustomerContact contact)
    {
        return null;
    }


}
