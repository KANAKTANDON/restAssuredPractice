package com.restassured;

import org.testng.annotations.Test;

import  io.restassured.RestAssured;
import  io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class firstgetmethod {
	
	//@Test
	public void REQRES_PUTrequest() {
		
		JSONObject data = new JSONObject();
		

		data.put("name","kanak");
		data.put("job","Test Engineer");
		
		given()
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then().statusCode(201)
		.log().all();
	}
	
	//@Test
	public void PutRequestBooksAPI() {
		
		JSONObject data = new JSONObject();
		String token = "c37ddea32aa0de931bdfe934ea5a01a4ce04700941f3a0cf032efb5f99ecd3bc";

		data.put("bookId",1);
		data.put("customerName","KanakT");
		
		given().headers("Authorization",token)
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("https://simple-books-api.glitch.me/orders")
		
		.then().statusCode(201)
		.log().all();
	}
	
	
	
	
	//@Test
	public void GOREST_GETrequest() {
		String token = "d5325f641a643e1478ad88a9f8f584c159aebac70a638239a66eaebbfedeb290";
		
		given().headers("Authorization",token)
		
		.when().get("https://gorest.co.in/public/v2/users/5889295")
		
		.then().statusCode(200).log().all();
	}
	
	@Test
public void REQRES_GETrequest() {
		
		
		
		given()
		
		
		.when()
		.post("https://reqres.in/api/users/2")
		
		.then().statusCode(201)
		.log().all();
	}
	
	
		
		
		
		
		
		
	
}
