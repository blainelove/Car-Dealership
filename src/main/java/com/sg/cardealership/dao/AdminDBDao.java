package com.sg.cardealership.dao;

import com.sg.cardealership.mapper.CarMapper;
import com.sg.cardealership.mapper.SpecialsMapper;
import com.sg.cardealership.mapper.userMapper;
import com.sg.cardealership.model.*;
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
        final String sql = "INSERT INTO cars(isNew, isFeatured, isSold, mileage, modelYear, VIN," +
                " makeID, modelId, transmissionType, bodyStyleType, bodyColorName, intColorName, salePrice," +
                " MSRP, vehicleDetails)" +
                " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setBoolean(1, car.isNew());
            statement.setBoolean(2, car.isFeatured());

            statement.setBoolean(3, car.isSold());
            statement.setInt(4, car.getMileage());
            statement.setInt(5, car.getModelYear());

            statement.setString(6, car.getVIN());
            statement.setInt(7, car.getMakeId());
            statement.setInt(8, car.getModelId());

            statement.setString(9, car.getTransmissionType());
            statement.setString(10, car.getBodyStyleType());
            statement.setString(11, car.getBodyColorName());

            statement.setString(12, car.getIntColorName());
            statement.setBigDecimal(13, car.getSalePrice());
            statement.setBigDecimal(14, car.getMsrp());

            statement.setString(15, car.getVehicleDetails());

            return statement;
        }, keyHolder);

        car.setCarId(keyHolder.getKey().intValue());

        return car;
    }

    @Override
    public Make createMake(Make make)
    {
        final String sql = "INSERT INTO make(makeName, current_timestamp(), addedBy)\n" +
                "VALUES (?,?,?);";

        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, make.getMakeName());
            statement.setString(2, make.getAddedBy());

            return statement;
        }, keyHolder);

        make.setMakeId(keyHolder.getKey().intValue());

        return make;
    }


    @Override
    public Model createModel(Model model)
    {
        final String sql = "INSERT INTO model(modelName, makeId, dateAdded, addedBy)\n" +
                "VALUES (?,?,current_timestamp(),?);";

        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, model.getModelName());
            statement.setInt(2, model.getMakeId());
            statement.setString(3, model.getAddedBy());

            return statement;
        }, keyHolder);

        model.setModelId(keyHolder.getKey().intValue());

        return model;
    }

    @Override
    public Specials addSpecial(Specials special)
    {
        final String sql = "INSERT INTO specials(specialDetails, title)\n" +
                "VALUES (?,?);";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, special.getSpecialDetails());
            statement.setString(2, special.getTitle());

            return statement;
        }, keyHolder);

        special.setSpecialsId(keyHolder.getKey().intValue());

        return special;
    }

    @Override
    public List<Users> getUsers()
    {
        final String sql = "SELECT * FROM users;";
        return jdbcTemplate.query(sql, new userMapper());
    }

    @Override
    public Users addUser(Users user)
    {
        final String sql = "INSERT INTO users(username, userPassword, isAdmin)\n" +
                "VALUES (?, ?, ?);";

        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setBoolean(3, user.isAdmin());

            return statement;
        }, keyHolder);

        user.setUserId(keyHolder.getKey().intValue());

        return user;
    }

    @Override
    public Users getUserById(int userId)
    {
        final String sql = "SELECT * FROM users WHERE userId = ?;";
        return jdbcTemplate.queryForObject(sql, new userMapper(), userId);
    }
}
