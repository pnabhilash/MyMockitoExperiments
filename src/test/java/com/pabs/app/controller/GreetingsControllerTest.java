package com.pabs.app.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(GreetingsController.class)
@RunWith(SpringRunner.class)
public class GreetingsControllerTest {
	
	@Autowired
	private MockMvc mockMVC;
	
	@Test
	public void greetringsController_basic() throws Exception {
		RequestBuilder requestBuilder=MockMvcRequestBuilders.get("/greetings").accept(MediaType.APPLICATION_JSON);
		MvcResult result=mockMVC.perform(requestBuilder)
				.andExpect(status().isOk())
				.andExpect(content().string("Greetings"))
				.andReturn();
		// if the above expect condition is added below assertEquals is not a mandatory !! 
		//assertEquals("Greetings",result.getResponse().getContentAsString());		
		
	}
	
	

}
