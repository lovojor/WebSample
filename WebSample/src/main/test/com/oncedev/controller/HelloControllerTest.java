/**
 * 
 */
package com.oncedev.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

/**
 * @author Lovojor
 *
 */
public class HelloControllerTest {	
	
	private static Logger log = LoggerFactory.getLogger(HelloController.class); 

    @Test
    public void testHandleRequestView() throws Exception{		
        HelloController controller = new HelloController();
        
        log.debug("HelloControllerTest.testHandleRequestView Init");
        
        Model model = new ExtendedModelMap();
        
        String view = controller.handleRequest(model, null, null);		
        assertEquals("hello", view);
        assertNotNull(model);
        assertTrue(model.containsAttribute("now"));
    }

}