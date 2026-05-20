package com.ebac.modulo61.components;

public class ServiceByConstructorClass {
    private final ModelClass modelClass;

    public ServiceByConstructorClass(ModelClass modelClass) {
        this.modelClass = modelClass;
    }

    public void taskExecution(){
        String elementById = modelClass.getElementById(1);
        System.out.println("Elemento: " + elementById);
    }
}
