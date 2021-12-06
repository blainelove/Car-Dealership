package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Profile("database")
public class AdminDBDao implements AdminDao
{
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AdminDBDao(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Cars> getVehicles()
    {
        final String sql = "SELECT * FROM cars;";
        return jdbcTemplate.query(sql, new CarMapper());
    }

    @Override
    public Cars getCarById(int carId)
    {
        final String sql = "SELECT * FROM cars WHERE carId = ?;";
        return jdbcTemplate.queryForObject(sql, new CarMapper(), carId);
    }


    private static final class CarMapper implements RowMapper<Cars>
    {
        @Override
        public Cars mapRow(ResultSet rs, int index) throws SQLException
        {
            Cars c = new Cars();
            c.setCarId(rs.getInt("carId"));
            c.setNew(rs.getBoolean("isNew"));
            c.setFeatured(rs.getBoolean("isFeatured"));
            c.setSold(rs.getBoolean("isSold"));
            c.setMileage(rs.getInt("mileage"));
            c.setModelYear(rs.getInt("modelYear"));
            c.setVIN(rs.getString("VIN"));
            c.setMakeId(rs.getInt("makeId"));
            c.setModelId(rs.getInt("modelId"));
            c.setTransmissionType(rs.getString("transmissionType"));
            c.setBodyStyleType(rs.getString("bodyStyleType"));
            c.setBodyColorName(rs.getString("bodyColorName"));
            c.setIntColorName(rs.getString("intColorName"));
            c.setSalePrice(rs.getBigDecimal("salePrice"));
            c.setMsrp(rs.getBigDecimal("MSRP"));
            c.setVehicleDetails(rs.getString("vehicleDetails"));
            return c;
        }
    }
}
