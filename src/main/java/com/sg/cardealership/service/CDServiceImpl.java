package com.sg.cardealership.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("database")
public class CDServiceImpl implements CDService
{

}
