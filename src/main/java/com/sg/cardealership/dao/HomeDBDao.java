package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.CustomerContact;
import com.sg.cardealership.model.Specials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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
        final String INSERT_CONTACT = "INSERT INTO customercontact() VALUES (?,?,?,?)";
        jdbc.update(INSERT_CONTACT, contact.getContactName(),contact.getMessageBody(),contact.getEmail(),contact.getPhone());
        int newContactId = jdbc.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        contact.setContactId(newContactId);
        return contact;
    }



    private static final class CarMapper implements RowMapper<Cars> {
        @Override
        public Cars mapRow(ResultSet rs, int index) throws SQLException {
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
    private static final class SpecialsMapper implements RowMapper<Specials>{
        @Override
        public Specials mapRow(ResultSet rs, int index) throws SQLException{
            Specials s= new Specials();
            s.setSpecialsId(rs.getInt("specialsId"));
            s.setSpecialDetails(rs.getString("specialDetails"));
            s.setTitle(rs.getString("title"));
            return s;
        }

    }
}
