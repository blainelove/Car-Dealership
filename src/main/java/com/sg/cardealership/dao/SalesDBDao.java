package com.sg.cardealership.dao;

import com.sg.cardealership.mapper.CarMapper;
import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
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
        final String INSERT_SALE = "INSERT INTO sales(purchaseType,purchaserName,carId,addressOne,addressTwo,city,email,phone,zipCode,purchasePrice,dateSold) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbc.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    INSERT_SALE,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, sale.getPurchaseType());
            statement.setString(2, sale.getPurchaserName());
            statement.setInt(3, sale.getCarId());

            statement.setString(4, sale.getAddressOne());
            statement.setString(5, sale.getAddressTwo());
            statement.setString(6, sale.getCity());

            statement.setString(7, sale.getEmail());
            statement.setString(8, sale.getPhone());
            statement.setString(9, sale.getZipCode());

            statement.setBigDecimal(10, sale.getPurchasePrice());
            statement.setDate(11, java.sql.Date.valueOf(sale.getDateSold()));
            return statement;
        }, keyHolder);

        sale.setCarId(keyHolder.getKey().intValue());

        return sale;
    }


}