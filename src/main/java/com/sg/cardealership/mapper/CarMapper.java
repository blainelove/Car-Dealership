package com.sg.cardealership.mapper;

import com.sg.cardealership.model.Cars;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class CarMapper implements RowMapper<Cars>
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