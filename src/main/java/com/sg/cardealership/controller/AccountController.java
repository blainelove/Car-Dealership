package com.sg.cardealership.controller;

import com.sg.cardealership.dao.AccountDao;
import com.sg.cardealership.dao.AdminDao;
import com.sg.cardealership.model.Users;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController
{
    private final AccountDao dao;
    public AccountController(AccountDao dao)
    {
        this.dao = dao;
    }

    @GetMapping("/login")
    public void login()
    {

    }

    @PostMapping("/changepassword/{userId}")
    public String changePassword(@RequestBody String newPassword, @PathVariable int userId)
    {
        Users user = dao.checkIfUserExists(userId);
        if (user != null)
        {
            String result = String.format("Your new password is %s", newPassword);
            return result;
        }

        return "User does not exist";
    }
}
