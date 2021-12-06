package com.sg.cardealership.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Profile("database")
public class AccountDBDao implements AccountDao
{
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AccountDBDao(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }
}
