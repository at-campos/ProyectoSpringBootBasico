package com.ebac.modulo61.components;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceByAnnotationsClass {
    @Autowired
    ModelClass modelClass;

    public void taskExecution(){
        String elementById = modelClass.getElementById(1);
        System.out.println("Elemento: " + elementById);
    }
}
