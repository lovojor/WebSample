package com.oncedev;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oncedev.beans.RentalLocation;
import com.oncedev.finder.ConstructorRentalService;

public class AdminConsole {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		ConstructorRentalService rentalService = context.getBean("rentalService",
				ConstructorRentalService.class);

		List<RentalLocation> locations = rentalService.find("Speed", "16802", 10);

		System.out.println("Se ha encontrado el título en los siguientes locales:");
		
		for (RentalLocation rentalLocation : locations) {
			System.out.println(rentalLocation.getName());
		}
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
