package com.sg.cardealership.dao;

import com.sg.cardealership.mapper.userMapper;
import com.sg.cardealership.model.Users;
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

    @Override
    public Users checkIfUserExists(int userId)
    {
        final String sql = "SELECT * FROM users WHERE userId = ?;";

        return jdbcTemplate.queryForObject(sql, new userMapper(), userId);
    }
}
