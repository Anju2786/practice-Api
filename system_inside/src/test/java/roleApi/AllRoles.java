package roleApi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AllRoles {
	@Test
	public void getAll_Roles() {
		Response response=RestAssured.get("https://scool360.com/fsm-webapi/api/allRoles");
		
		System.out.println("\n----------------displaying response header & Body-----------\n");
		
		
		System.out.println("response  path : "+response.getBody().prettyPeek());
		
		System.out.println("\n----------------displaying Status code-----------\n");
		//get response status code
		System.out.println("Status code "+response.getStatusCode());
		//get response content type
		System.out.println("\n----------------displaying response content type-----------\n");
		System.out.println("response content type "+response.getContentType());
		//get time taken to get a response
		System.out.println("\n----------------displaying response time-----------\n");
		System.out.println("response time: "+response.getTime());
	 
		
		 int statusCode = response.getStatusCode();
		
		 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
		
		
	}

}
