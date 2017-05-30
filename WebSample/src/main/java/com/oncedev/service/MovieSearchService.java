/**
 * 
 */
package com.oncedev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.oncedev.beans.RentalLocation;
import com.oncedev.finder.ConstructorRentalService;

/**
 * @author Lovojor
 *
 */
@Service("MovieSearchService")
public class MovieSearchService {

	public List<String> findDilers(String title) {

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		ConstructorRentalService rentalService = context.getBean("rentalService", ConstructorRentalService.class);

		ConstructorRentalService digitalMediaRentalService = context.getBean("digitalMediaRentalService",
				ConstructorRentalService.class);

		List<RentalLocation> locations = rentalService.find(title, "0", 10);
		locations.addAll(digitalMediaRentalService.find(title, "0", 10));
		List<String> result = new ArrayList<String>();
		for (RentalLocation rentalLocation : locations) {
			result.add(rentalLocation.getName());
		}

		((ClassPathXmlApplicationContext) context).close();

		return result;
	}

}
