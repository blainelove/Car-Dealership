package com.sg.cardealership.dao;

import com.sg.cardealership.mapper.CarMapper;
import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("database")
public class SalesDBDao implements SalesDao{

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public List<Cars> getNotSoldCars() {
        final String SELECT_ALL_GAMES = "SELECT * FROM cars WHERE isSold = 0";
        return jdbc.query(SELECT_ALL_GAMES, new CarMapper());
    }

    @Override
    public Sales addSales(Sales sale){
        final String INSERT_SALE = "INSERT INTO customercontact() VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        jdbc.update(INSERT_SALE, sale.getPurchaseType(),sale.getPurchaserName(),sale.getCarId(),sale.getAddressOne(),sale.getCity(),sale.getEmail(),sale.getPhone(),
                sale.getZipCode(), sale.getPurchasePrice());
        int newSaleId = jdbc.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        sale.setPurchaseLogId(newSaleId);
        return sale;
    }



}