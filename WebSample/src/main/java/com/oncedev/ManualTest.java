package com.oncedev;

import java.util.List;

import com.oncedev.beans.RentalLocation;
import com.oncedev.finder.ManualRentalService;

public class ManualTest {

	public static void main(String[] args) {
		ManualRentalService rentalService = new ManualRentalService();//"key"));

		List<RentalLocation> locations = rentalService.find("Speed", "16802", 10);
		
		System.out.println("Se ha encontrado el título en los siguientes locales:");
		
		for (RentalLocation rentalLocation : locations) {
			System.out.println(rentalLocation.getName());
		}

	}

}
