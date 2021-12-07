package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Sales;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.sg.cardealership.mapper.CarMapper;
import com.sg.cardealership.mapper.SalesMapper;

@Repository
@Profile("database")
public class ReportsDBDao implements ReportsDao
{
    private final JdbcTemplate jdbcTemplate;
    
    @Autowired
    public ReportsDBDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public List<Cars> getInventory() {
        final String sql = "SELECT carId, isNew, isFeatured, isSold, mileage, modelYear,VIN, makeId, modelId, transmissionType, bodyStyleType, bodyColorName, intColorName, salePrice, MSRP, vehicleDetails FROM cars;";
        List<Cars> allCars = jdbcTemplate.query(sql, new CarMapper());
        return allCars;
    }

    @Override
    public List<Sales> getSales() {
        final String sql = "SELECT carId, isNew, isFeatured, isSold, mileage, modelYear,VIN, makeId, modelId, transmissionType, bodyStyleType, bodyColorName, intColorName, salePrice, MSRP, vehicleDetails FROM cars;";
        List<Sales> allSales = jdbcTemplate.query(sql, new SalesMapper());
        return allSales;
    }

}


