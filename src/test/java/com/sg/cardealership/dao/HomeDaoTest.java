/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.cardealership.dao;

import com.sg.cardealership.model.Cars;
import com.sg.cardealership.model.CustomerContact;
import com.sg.cardealership.model.Specials;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author willd
 */
public class HomeDaoTest {
    
    public HomeDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFeaturedCars method, of class HomeDao.
     */
    @Test
    public void testGetFeaturedCars() {
    }

    /**
     * Test of addContact method, of class HomeDao.
     */
    @Test
    public void testAddContact() {
    }

    /**
     * Test of getSpecials method, of class HomeDao.
     */
    @Test
    public void testGetSpecials() {
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
