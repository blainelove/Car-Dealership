package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.PurchaseLog;
import com.sg.cardealership.model.Specials;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

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
        List<Cars> allCars = jdbcTemplate.query(sql, new ReportsDBDao.CarMapper());
        return allCars;
    }

//    @Override
//    public List<PurchaseLog> getSales() {
//        
//    }
    
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


