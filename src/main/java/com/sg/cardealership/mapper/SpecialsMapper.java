package com.sg.cardealership.mapper;

import com.sg.cardealership.model.Specials;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class SpecialsMapper implements RowMapper<Specials>
{
    @Override
    public Specials mapRow(ResultSet rs, int index) throws SQLException
    {
        Specials s= new Specials();
        s.setSpecialsId(rs.getInt("specialsId"));
        s.setSpecialDetails(rs.getString("specialDetails"));
        s.setTitle(rs.getString("title"));
        return s;
    }

}