package com.oncedev;

import java.util.List;

import com.oncedev.beans.RentalLocation;
import com.oncedev.finder.ConstructorRentalService;
import com.oncedev.finder.DigitalMediaLocator;
import com.oncedev.finder.KioskLocator;

public class ConstructorTest {

	public static void main(String[] args) {
		ConstructorRentalService rentalService = new ConstructorRentalService(new KioskLocator());
		ConstructorRentalService rentalService2 = new ConstructorRentalService(new DigitalMediaLocator());
		List<RentalLocation> locations = rentalService.find("Speed", "16802", 10);
		locations.addAll(rentalService2.find("Speed", "16802", 10));
		
		System.out.println("Se ha encontrado el título en los siguientes locales:");
		
		for (RentalLocation rentalLocation : locations) {
			System.out.println(rentalLocation.getName());
		}

	}

}
