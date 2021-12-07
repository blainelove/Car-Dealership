package com.sg.cardealership.dao;

import com.sg.cardealership.model.Users;

public interface AccountDao
{
    Users checkIfUserExists(int userId);
}