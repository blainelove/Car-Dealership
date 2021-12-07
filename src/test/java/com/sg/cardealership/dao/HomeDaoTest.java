/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.cardealership.dao;

import com.sg.cardealership.TestApplicationConfiguration;
import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.CustomerContact;
import com.sg.cardealership.model.Specials;

import java.math.BigDecimal;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 *
 * @author willd
 */
@SpringBootTest(classes = TestApplicationConfiguration.class)
@RunWith(SpringRunner.class)
public class HomeDaoTest {

    @Autowired
    HomeDao homeDao;

    /**
     * Test of getFeaturedCars method, of class HomeDao.
     */
    @Test
    public void testGetFeaturedCars()
    {
        Cars car = new Cars(2,true,true,false,0,2020,
                "FDSAFDSA324",1,1, BigDecimal.valueOf(50000),
                BigDecimal.valueOf(40000),"Manual","Black",
                "blue","red","Test Car");

        Cars inDb = homeDao.getFeaturedCars().get(0);

        assertEquals(car.getCarId(), inDb.getCarId());
    }

    /**
     * Test of getSpecials method, of class HomeDao.
     */
    @Test
    public void testGetSpecials()
    {
        Specials special = new Specials(1, "test", "Title Test");

        Specials inDb = homeDao.getSpecials().get(0);

        assertEquals(special.getSpecialsId(), inDb.getSpecialsId());
        assertEquals(special.getTitle(), inDb.getTitle());
        assertEquals(special.getTitle(), inDb.getTitle());
    }

    public class HomeDaoImpl implements HomeDao {

        public List<Cars> getFeaturedCars() {
            return null;
        }

        public CustomerContact addContact(CustomerContact contact) {
            return null;
        }

        public List<Specials> getSpecials() {
            return null;
        }
    }
    
}
