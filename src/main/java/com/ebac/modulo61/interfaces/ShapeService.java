package com.ebac.modulo61.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeService {
    @Autowired
    @Qualifier("square")
    Shape shapeOne; //Square

    @Autowired
    @Qualifier("triangle")
    Shape shapeTwo; //Triangle

    public void printName1(){
        shapeOne.name();
    }

    public void printName2(){
        shapeTwo.name();
    }
}
