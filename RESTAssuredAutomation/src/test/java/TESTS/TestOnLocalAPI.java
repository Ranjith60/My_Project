package TESTS;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;




public class TestOnLocalAPI {

	
	
	
	//@Test
	public void get() {
		
		baseURI="https://dev-432m23875987y40.api.raw-labs.com";
		
		given().get("/json-programming-heroes").then().statusCode(200).log().all();		
		
	
		
		
	}
	
	@Test
	public void post() {
		
		JSONObject request=new JSONObject();
		
		request.put("hero_name", "ram");
		request.put("hero_superpowers","super powers");
		request.put("id", 2);
		
		baseURI="https://dev-432m23875987y40.api.raw-labs.com";

		given().header("Content-Type","application/json").
		        contentType(ContentType.JSON).
		        accept(ContentType.JSON).
		        body(request.toJSONString()).
		when().post("/json-programming-heroes").
		then().statusCode(200).log().all();
		
	}
	
	
	
	
	
	
}
