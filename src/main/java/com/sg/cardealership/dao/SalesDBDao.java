package com.sg.cardealership.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("database")
public class SalesDBDao implements SalesDao
{

}
