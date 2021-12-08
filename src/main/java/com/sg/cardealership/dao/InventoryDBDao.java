package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import com.sg.cardealership.mapper.CarMapper;

@Repository
    @Profile("database")
public class InventoryDBDao implements InventoryDao{
    
    private final JdbcTemplate jdbcTemplate;
    
    @Autowired
    public InventoryDBDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    
    @Override
    public List<Cars> getUsed() {
        final String sql = "SELECT carId, isNew, isFeatured, isSold, mileage, modelYear,VIN, makeId, modelId, transmissionType, bodyStyleType, bodyColorName, intColorName, salePrice, MSRP, vehicleDetails FROM cars;";
        List<Cars> allCars = jdbcTemplate.query(sql, new CarMapper());
        
        ArrayList<Cars> allCarsUsed = new ArrayList<Cars>();
        for (Cars car : allCars){
            if (!car.isNew()) {
                allCarsUsed.add(car);
            } 
        }
        return allCarsUsed;
    }

    @Override
    public List<Cars> getNew() {
        final String sql = "SELECT carId, isNew, isFeatured, isSold, mileage, modelYear,VIN, makeId, modelId, transmissionType, bodyStyleType, bodyColorName, intColorName, salePrice, MSRP, vehicleDetails FROM cars;";
        List<Cars> allCars = jdbcTemplate.query(sql, new CarMapper());
        
        ArrayList<Cars> allCarsNew = new ArrayList<Cars>();
        for (Cars car : allCars){
            if (car.isNew()) {
                allCarsNew.add(car);
            } 
        }
        return allCarsNew;
    }
    

    @Override
    public Cars getCarDetails(int carId) {
        final String sql = "SELECT carId, isNew, isFeatured, isSold, mileage, modelYear,VIN, makeId, modelId, transmissionType, bodyStyleType, bodyColorName, intColorName, salePrice, MSRP, vehicleDetails FROM cars WHERE carId = ?;";
        Cars foundCar =  jdbcTemplate.queryForObject(sql, new CarMapper(), carId);
        return foundCar;
    }
    
    
    
    

}
