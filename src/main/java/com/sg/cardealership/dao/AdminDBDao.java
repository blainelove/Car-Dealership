package com.sg.cardealership.dao;

import com.sg.cardealership.mapper.CarMapper;
import com.sg.cardealership.mapper.SpecialsMapper;
import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.Make;
import com.sg.cardealership.model.Model;
import com.sg.cardealership.model.Specials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
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

    @Override
    public Specials getSpecialById(int specialId)
    {
        final String sql = "SELECT * FROM specials WHERE specialsId = ?;";
        return jdbcTemplate.queryForObject(sql, new SpecialsMapper(), specialId);
    }

    @Override
    public Specials removeSpecialById(int specialsId)
    {
        final String sql = "DELETE FROM specials WHERE specialsId = ?;";

        return jdbcTemplate.queryForObject(sql, new SpecialsMapper(), specialsId);
    }

    @Override
    public Cars addVehicle(Cars car)
    {
        final String sql = "INSERT INTO cars(carId, isNew, isFeatured, isSold, mileage, modelYear, VIN," +
                " makeID, modelId, transmissionType, bodyStyleType, bodyColorName, intColorName, salePrice," +
                " MSRP, vehicleDetails)" +
                " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, car.getCarId());
            statement.setBoolean(2, car.isNew());
            statement.setBoolean(3, car.isFeatured());

            statement.setBoolean(4, car.isSold());
            statement.setInt(5, car.getMileage());
            statement.setInt(6, car.getModelYear());

            statement.setString(7, car.getVIN());
            statement.setInt(8, car.getMakeId());
            statement.setInt(9, car.getModelId());

            statement.setString(10, car.getTransmissionType());
            statement.setString(11, car.getBodyStyleType());
            statement.setString(12, car.getBodyColorName());

            statement.setString(13, car.getIntColorName());
            statement.setBigDecimal(14, car.getSalePrice());
            statement.setBigDecimal(15, car.getMsrp());

            statement.setString(16, car.getVehicleDetails());

            return statement;
        }, keyHolder);

        car.setCarId(keyHolder.getKey().intValue());

        return car;
    }

    @Override
    public Make createMake(Make make)
    {
        final String sql = "INSERT INTO make(makeId, makeName, current_timestamp(), addedBy)\n" +
                "VALUES (?,?,?,?);";

        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, make.getMakeId());
            statement.setString(2, make.getMakeName());
            statement.setString(3, make.getAddedBy());

            return statement;
        }, keyHolder);

        make.setMakeId(keyHolder.getKey().intValue());

        return make;
    }


    @Override
    public Model createModel(Model model)
    {
        final String sql = "INSERT INTO model(modelId, modelName, makeId, dateAdded, addedBy)\n" +
                "VALUES (?,?,?,current_timestamp(),?);";

        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, model.getModelId());
            statement.setString(2, model.getModelName());
            statement.setInt(3, model.getMakeId());
            statement.setString(4, model.getAddedBy());

            return statement;
        }, keyHolder);

        model.setModelId(keyHolder.getKey().intValue());

        return model;
    }

    @Override
    public Specials addSpecial(Specials special)
    {
        final String sql = "INSERT INTO specials(specialsId, specialDetails, title)\n" +
                "VALUES (?,?,?);";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, special.getSpecialsId());
            statement.setString(2, special.getSpecialDetails());
            statement.setString(3, special.getTitle());

            return statement;
        }, keyHolder);

        special.setSpecialsId(keyHolder.getKey().intValue());

        return special;
    }
}
