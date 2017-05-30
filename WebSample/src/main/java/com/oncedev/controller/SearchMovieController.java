/**
 * 
 */
package com.oncedev.controller;

import javax.servlet.ServletException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oncedev.service.MovieSearchService;
import com.oncedev.view.SearchMovie;

/**
 * @author Lovojor
 *
 */
@Controller
@RequestMapping("/search.htm")
public class SearchMovieController {
	
	@Autowired
	@Qualifier("MovieSearchService")
	MovieSearchService searchService;
	
	@RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid SearchMovie form, BindingResult result, Model model)
    {
        if (result.hasErrors()) {
            return "search";
        }
		
        model.addAttribute("dealers", searchService.findDilers(form.getTitle()));
        
        return "search";
    }
	
	
	@RequestMapping(method = RequestMethod.GET)
    protected String formBackingObject(SearchMovie searchMovie, Model model) throws ServletException {
        return "search";
    }
	
}
