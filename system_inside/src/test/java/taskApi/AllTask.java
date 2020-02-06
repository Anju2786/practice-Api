package taskApi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AllTask {
	
	@Test
	public void task_allTask() {
		
			Response response=RestAssured.get("https://scool360.com/fsm-webapi/api/allTasks/22");
			
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
