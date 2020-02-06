package workFlow;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class GetInventory_BranchId {
	@Test
	public void workflow_getInventory_BranchId42() {
		
		 System.out.println("\n----------------Work flow module-----------\n");
			
			
			     
			
				Response response=RestAssured.get("https://scool360.com/fsm-webapi/api/getInventory/42");
				
				System.out.println("\n----------------displaying response header & Body-----------\n");
				
				System.out.println("response  path : "+response.getBody().prettyPeek());
				
				System.out.println("\n----------------displaying Status code-----------\n");
				System.out.println("Status code: "+response.getStatusCode());
				System.out.println("\n----------------displaying response content type-----------\n");
				System.out.println("response content type: "+response.getContentType());
				System.out.println("\n----------------displaying response time-----------\n");
				System.out.println("response time "+response.getTime());
			 
				
				 int statusCode = response.getStatusCode();
				
				 Assert.assertEquals(statusCode, 200 );
				
			
		}
	@Test
	public void workflow_getInventory_BranchId22() {
			
			    
			
				Response response=RestAssured.get("https://scool360.com/fsm-webapi/api/getInventory/22");
				
				System.out.println("\n----------------displaying response header & Body-----------\n");
				
				System.out.println("response  path : "+response.getBody().prettyPeek());
				
				System.out.println("\n----------------displaying Status code-----------\n");
				System.out.println("Status code: "+response.getStatusCode());
				System.out.println("\n----------------displaying response content type-----------\n");
				System.out.println("response content type: "+response.getContentType());
				System.out.println("\n----------------displaying response time-----------\n");
				System.out.println("response time "+response.getTime());
			 
				
				 int statusCode = response.getStatusCode();
				
				 Assert.assertEquals(statusCode, 200 );
				
			
		}

 

}
