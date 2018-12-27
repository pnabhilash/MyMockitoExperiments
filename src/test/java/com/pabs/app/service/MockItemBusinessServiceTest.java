package com.pabs.app.service;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.pabs.app.beans.Item;
import com.pabs.app.controller.ItemController;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class MockItemBusinessServiceTest {
	
	@Autowired
	private MockMvc mockMVC;
	
	@MockBean
	ItemBusinessService itemBusinessService;
	
	
	@Test
	public void testHardCodedItemRetrievalFromBizServiceLayer() throws Exception {
	
   /*
    * The objectivity is to NOT To test Biz service clsss (ItemBusinessService but Controller response
    * Hence we are hardcoding BusinessService response here ...
    * 		
    */
	when(itemBusinessService.retriveHardCodedItem()).thenReturn(new Item(1,"FootBall",10,10));
	
	
	RequestBuilder request=MockMvcRequestBuilders
			.get("/item-from-bis-service")
			.accept(MediaType.APPLICATION_JSON);
	
	MvcResult result=mockMVC.perform(request)
			.andExpect(status().isOk())
			.andReturn();
			
	
	boolean strict = true; // makes exact match for elements (not spaces)
	String expectedResponse = "{id:1,name:FootBall,price:10,quantity:10}";
	JSONAssert.assertEquals(expectedResponse, 
			result.getResponse().getContentAsString(), 
			strict);
	
	}
	
	

}
