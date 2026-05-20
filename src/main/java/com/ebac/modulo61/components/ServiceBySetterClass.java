package com.ebac.modulo61.components;

public class ServiceBySetterClass {

    private ModelClass modelClass;

    public void taskExecution(){
        String elementById = modelClass.getElementById(1);
        System.out.println("Elemento: " + elementById);
    }

    public void setModelClass(ModelClass modelClass){
        this.modelClass = modelClass;
    }
}
