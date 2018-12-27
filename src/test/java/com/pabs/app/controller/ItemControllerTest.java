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

@WebMvcTest(ItemController.class)
@RunWith(SpringRunner.class)
public class ItemControllerTest {
	
	@Autowired
	private MockMvc mockMVC;
	
	@Test
	public void dummyItemListDisplayController() throws Exception {
		RequestBuilder requestBuilder=MockMvcRequestBuilders.get("/dummyitemlist").accept(MediaType.APPLICATION_JSON);
		MvcResult result=mockMVC.perform(requestBuilder)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\": 1,\"name\": \"FootBall\",\"price\": 10,\"quantity\": 100}"))
				.andReturn();
		// if the above expect condition is added below assertEquals is not a mandatory !! 
		//assertEquals("Greetings",result.getResponse().getContentAsString());		
		
	}
	
	

}
