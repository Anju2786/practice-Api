package workFlow;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

 public  class AddClosingDetails{
	 @Test
	 public void  workflow_addClosingDetailsWithData() {
		 
		 HashMap data=new HashMap();
			System.out.println("-------Add Closing details-------");
			 
			 data.put("itemTaskMapId",452590);
		     data.put("taskId", 289689);
		     data.put("closingDate","10/10/2020");
		     data.put("closingTime", "10:30:12");
		     data.put( "closingRemarks", "Parts changed,working properly");
		    
		    
		 
		     Response response=null;
	    		try { 	
	    			response=RestAssured.given()
	    					.contentType("application/json")
			    		    .body(data)
			    		    .post("https://scool360.com/fsm-webapi/api/addClosingDetails")
			    		    .then()
				    		   .statusCode(200)
					            .log().body().extract().response();
	    			
	    		}
	    		    catch (Exception e) {
						// TODO: handle exception
					}
	    		
		    
			  
	 }
	 
	 
	@Test
	 public void  workflow_addClosingDetails() {
		 
		 HashMap data=new HashMap();
			System.out.println("-------Add Closing details-------");
			 
			 data.put("itemTaskMapId", 0);
		     data.put("taskId", 0);
		     data.put("closingDate","String");
		     data.put("closingTime", "String");
		     data.put( "closingRemarks", "String");
		    
		    
		 
		     
		     Response response=null;
	    		try { 	
	    			response=RestAssured.given()
	    					.contentType("application/json")
			    		    .body(data)
			    		    .post("https://scool360.com/fsm-webapi/api/addClosingDetails")
			    		    .then()
				    		   .statusCode(200)
					            .log().body().extract().response();
	    			
	    		}
	    		    catch (Exception e) {
						// TODO: handle exception
					}
	    		
	    		   
//	    		 
	    		
	    		
//System.out.println("response"+response.asString());
//System.out.println("Status code"+response.getStatusCode());
//Assert.assertEquals(200, response.getStatusCode());
//
} 
			  
	 }
	 
	 


