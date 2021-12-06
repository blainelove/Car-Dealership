package com.sg.cardealership.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController
{
    @GetMapping
    public void login()
    {

    }

    @PostMapping("/changepassword")
    public String changePassword(@RequestBody String newPassword)
    {
        return "";
    }
}
