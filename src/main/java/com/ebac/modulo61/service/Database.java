package com.ebac.modulo61.service;

import org.springframework.beans.factory.annotation.Value;

public class Database {

    @Value("${db.dev.url}")
    String dbUrl;

    @Value("root")
    String user;

    @Value("${VARIABLE_AMBIENTE}")
    String variableDeAmbiente;

    public String getById(int id){
        System.out.println("DB url: " + dbUrl);
        System.out.println("Default: " + user);
        System.out.println("Variable de ambiente: " + variableDeAmbiente);
        return "Elemento de id " + id + " encontrado";
    }
}
