package com.sg.cardealership.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController
{
    @GetMapping("/login")
    public void login()
    {

    }

    @PostMapping("/changepassword")
    public String changePassword(@RequestBody String newPassword)
    {
        String result = String.format("Your new password is %s", newPassword);
        return result;
    }
}
