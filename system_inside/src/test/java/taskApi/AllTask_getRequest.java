package taskApi;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AllTask_getRequest {
	
	//@Test(priority=1)
	public void task_getReq_EnggId293_BranchId42() {
		
		System.out.println("\n----------------displaying request of EnggId293,BranchId42-----------\n");
		
			Response response=RestAssured.get("https://scool360.com/fsm-webapi/api/task/getRequests/293/42");
			
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

	@Test(priority=2)
	public void task_getReq_EnggId278_BranchId22() {
		System.out.println("\n----------------displaying request of EnggId278,BranchId22-----------\n");
		
			Response response=RestAssured.get("https://scool360.com/fsm-webapi/api/task/getRequests/278/22");
			
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
