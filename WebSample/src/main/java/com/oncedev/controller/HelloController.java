/**
 * 
 */
package com.oncedev.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lovojor
 *
 */
@Controller
public class HelloController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value="/hello.htm")
    public String handleRequest(Model model, HttpServletRequest request, HttpSession session)
            throws ServletException, IOException {

    	String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);
        model.addAttribute("now", now);
        
        return "hello";
    }

}
