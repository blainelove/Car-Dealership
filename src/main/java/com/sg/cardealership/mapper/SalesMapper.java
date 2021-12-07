/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.cardealership.mapper;

import com.sg.cardealership.model.Sales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Blaine
 */
public class SalesMapper implements RowMapper<Sales>
{
    @Override
    public Sales mapRow(ResultSet rs, int index) throws SQLException
    {
        Sales s= new Sales();
        s.setPurchaseLogId(rs.getInt("purchaseLogId"));
        s.setPurchaseType(rs.getString("purchaseType"));
        s.setPurchaserName(rs.getString("purchaserName"));
        s.setCarId(rs.getInt("carId"));
        s.setAddressOne(rs.getString("addressOne"));
        s.setAddressTwo(rs.getString("addressTwo"));
        s.setCity(rs.getString("city"));
        s.setEmail(rs.getString("email"));
        s.setPhone(rs.getString("phone"));
        s.setZipCode(rs.getString("zipCode"));
        s.setPurchasePrice(rs.getBigDecimal("purchasePrice"));
        s.setDateSold(rs.getDate("dateSold").toLocalDate());
        return s;
    }
}
