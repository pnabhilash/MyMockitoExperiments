package com.pabs.app.controller;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

public class JSONAssertSpikeTest {

	String actualResponse = "{\"id\": 1,\"name\": \"FootBall\",\"price\": 10,\"quantity\": 100}";

	// This will pass as it is exact match

	@Test
	public void jsonAssert_Basic_ExactMatch() throws JSONException {
		boolean strict = true; // makes exact match for elements (not spaces)
		String expectedResponse = "{\"id\": 1,\"name\": \"FootBall\",\"price\": 10,\"quantity\": 100}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, strict);
	}

	// This will also pass though spaces are added and "strict" condition is made
	// true
	@Test
	public void jsonAssert_Basic_ExactMatchWithSpaces() throws JSONException {
		boolean strict = true; // makes exact match for elements (not spaces)
		String expectedResponse = "{\"id\": 1,  \"name\":     \"FootBall\",\"price\": 10,\"quantity\": 100}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, strict);
	}

	// This will fail for missing elements since "strict" condition is made true
	@Test
	public void jsonAssert_Basic_MissingElements() throws JSONException {
		boolean strict = true; // makes exact match for elements (not spaces)
		String expectedResponse = "{\"id\": 1,  \"name\":     \"FootBall\",\"price\": 10}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, strict);
	}

	// This will pass though for missing elements but "strict" condition is made
	// false
	@Test
	public void jsonAssert_Basic_MissingElementsStrictFalse() throws JSONException {
		boolean strict = false; // makes exact match for elements (not spaces)
		String expectedResponse = "{\"id\": 1,  \"name\":     \"FootBall\",\"price\": 10}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, strict);
	}

	
	// This will be pass case - 
	@Test
	public void jsonAssert_Basic_NoEscapeCharsPlainText_WithStrictFalse() throws JSONException {
		boolean strict = false; // makes exact match for elements (not spaces)
		String expectedResponse = "{id:1,name:FootBall,price:10}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, strict);
	}
	
	    // This will be pass case - 
		/*
		 * With strict condition only thing that would be considered is whether available info 
		 * in expected and actual is exactly match .. which means id=id and id=1 it doesn't matter missing or not
		 */
		
		@Test
		public void jsonAssert_Basic_NoEscapeCharsPlainText_WithStrictTrue() throws JSONException {
			boolean strict = true; // makes exact match for elements (not spaces)
			String expectedResponse = "{id:1,name:FootBall,price:10,quantity:100}";
			JSONAssert.assertEquals(expectedResponse, actualResponse, strict);
		}
	
	
}
