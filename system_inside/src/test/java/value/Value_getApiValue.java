package value;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Value_getApiValue {
	@Test
public void value_getValue() {
		
		     System.out.println("\n----------------displaying Value-----------\n");
		
			Response response=RestAssured.get("https://scool360.com/fsm-webapi/api/Values");
			
			System.out.println("\n----------------displaying response header & Body-----------\n");
			
			System.out.println("response  path : "+response.getBody().prettyPeek());
			
			System.out.println("\n----------------displaying Status code-----------\n");
			System.out.println("Status code: "+response.getStatusCode());
			System.out.println("\n----------------displaying response content type-----------\n");
			System.out.println("response content type: "+response.getContentType());
			System.out.println("\n----------------displaying response time-----------\n");
			System.out.println("response time "+response.getTime());
		 
			
			 int statusCode = response.getStatusCode();
			
			 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
			
		
	}

}
