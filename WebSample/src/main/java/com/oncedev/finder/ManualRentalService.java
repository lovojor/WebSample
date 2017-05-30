package com.oncedev.finder;

import java.util.ArrayList;
import java.util.List;

import com.oncedev.beans.RentalLocation;

public class ManualRentalService {

	private KioskLocator locator;

	public ManualRentalService() {
		super();
		this.locator = new KioskLocator();
	}

	public List<RentalLocation> find(String title, String zipcode, int miles) {
		List<RentalLocation> locations = this.locator.find(zipcode, miles);

		List<RentalLocation> results = new ArrayList<RentalLocation>();
		for (RentalLocation location : locations) {
			if (location.getTitles().contains(title)) {
				results.add(location);
			}
		}

		return results;
	}
}
