package com.sg.cardealership.mapper;

import com.sg.cardealership.model.Specials;
import com.sg.cardealership.model.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class userMapper implements RowMapper<Users>
{
    @Override
    public Users mapRow(ResultSet rs, int index) throws SQLException
    {
        Users u = new Users();
        u.setUserId(rs.getInt("userId"));
        u.setUsername(rs.getString("username"));
        u.setPassword(rs.getString("userPassword"));
        u.setAdmin(rs.getBoolean("isAdmin"));
        return u;
    }

}
