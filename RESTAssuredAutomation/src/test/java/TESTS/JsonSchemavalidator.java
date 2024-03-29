package TESTS;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class JsonSchemavalidator {

	
	@Test
	
	
	public void testget() {
		
		baseURI="https://reqres.in/api";
		
		given().
		     get("/users?page=2").
		then().
		    assertThat().body(matchesJsonSchemaInClasspath("schema.json")).
		    statusCode(200).
		body("data[4].first_name",equalTo("George")).
		body("data.first_name",hasItems("George","Rachel"));
		
	}
	
	
	
	
	
}
