package com.ebac.modulo61;

import com.ebac.modulo61.interfaces.ShapeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.ebac.modulo61");
        context.refresh();

        /*Service service = context.getBean(Service.class);
        String byId = service.getById(15);
        System.out.println(byId);*/

        ShapeService shapeService = context.getBean(ShapeService.class);
        shapeService.printName1();
        shapeService.printName2();
    }
}
