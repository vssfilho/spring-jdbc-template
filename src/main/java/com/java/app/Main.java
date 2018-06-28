package com.java.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.app.patente.dao.PatenteDao;
import com.java.spring.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PatenteDao daoPatente = context.getBean(PatenteDao.class);
		
		daoPatente.getAll().forEach(p -> System.out.println(p));
		
		context.close();
	}

}
