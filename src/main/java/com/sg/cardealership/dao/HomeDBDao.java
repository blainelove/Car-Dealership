package com.sg.cardealership.dao;

import com.sg.cardealership.mapper.CarMapper;
import com.sg.cardealership.mapper.SpecialsMapper;
import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.CustomerContact;
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
public class HomeDBDao implements HomeDao{

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public List<Cars> getFeaturedCars() {
        final String SELECT_ALL_GAMES = "SELECT * FROM cars WHERE isFeatured = 1";
        return jdbc.query(SELECT_ALL_GAMES, new CarMapper());
    }

    @Override
    public List<Specials> getSpecials(){
        final String SELECT_ALL_GAMES = "SELECT * FROM specials";
        return jdbc.query(SELECT_ALL_GAMES, new SpecialsMapper());
    }

    @Override
    public CustomerContact addContact(CustomerContact contact){
        final String INSERT_CONTACT = "INSERT INTO customerContact(contactName, messageBody, email, phone) VALUES (?,?,?,?)";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbc.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                    INSERT_CONTACT,
                    Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, contact.getContactName());
            statement.setString(2, contact.getMessageBody());
            statement.setString(3, contact.getEmail());

            statement.setString(4, contact.getPhone());


            return statement;
        }, keyHolder);

        contact.setContactId(keyHolder.getKey().intValue());

        return contact;
    }

}
