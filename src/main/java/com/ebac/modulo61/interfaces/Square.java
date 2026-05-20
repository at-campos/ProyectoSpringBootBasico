package com.ebac.modulo61.interfaces;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("square")
public class Square implements Shape {
    @Override
    public void name(){
        System.out.println("Soy unn cuadrado");
    }
}
