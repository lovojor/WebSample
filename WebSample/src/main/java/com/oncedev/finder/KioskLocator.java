package com.oncedev.finder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.oncedev.beans.RentalLocation;

@Component("kioskLocator")
public class KioskLocator implements SourceLocator {


	private static List<RentalLocation> locations = new ArrayList<RentalLocation>();
	
	
	public KioskLocator() {
	}

	static {
		locations.add(new RentalLocation("Kiosk A", Arrays.asList("Forest Gump", "Speed")));
		locations.add(new RentalLocation("Kiosk B", Arrays.asList("Jaws", "Ghost")));
		locations.add(new RentalLocation("Kiosk C", Arrays.asList("Forest Gump", "Hook")));
	}

	/* (non-Javadoc)
	 * @see com.infiniteskills.spring.di.SourceLocator#find(java.lang.String, int)
	 */
	public List<RentalLocation> find(String zipcode, int radius) {
		return locations;
	}

}
