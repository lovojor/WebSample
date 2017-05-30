package com.oncedev.finder;

import java.util.List;

import com.oncedev.beans.RentalLocation;

public interface SourceLocator {

	public abstract List<RentalLocation> find(String zipcode, int radius);

}