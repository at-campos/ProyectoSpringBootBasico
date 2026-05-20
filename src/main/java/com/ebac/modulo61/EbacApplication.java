package com.ebac.modulo61;

import com.ebac.modulo61.components.ServiceByAnnotationsClass;
import com.ebac.modulo61.components.ServiceByConstructorClass;
import com.ebac.modulo61.components.ServiceBySetterClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.Provider;

public class EbacApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ServiceBySetterClass myBean = (ServiceBySetterClass) context.getBean("serviceClassBean");
		ServiceByConstructorClass myConstructorBean = (ServiceByConstructorClass) context.getBean("serviceByConstructorBean");
		ServiceByAnnotationsClass myAnnotationBean = (ServiceByAnnotationsClass) context.getBean("serviceByAnnotation");

		myBean.taskExecution();
		myConstructorBean.taskExecution();
		myAnnotationBean.taskExecution();
	}
}
