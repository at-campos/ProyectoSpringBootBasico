package com.ebac.modulo61.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Service {

    @Autowired
    Database database;

    public String getById(int id){
        if(id < 10){
            return "Id no puede ser menor a 10";
        }
        return database.getById(id);
    }
}
