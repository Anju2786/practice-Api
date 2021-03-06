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

 public  class RequestPart{
	 @Test
	 public void  workflow_request() {
		 
		 HashMap data=new HashMap();
			System.out.println("-------request part-------");
			 
			 data.put("engineerId", 293);
		     data.put("branchId",42);
		     data.put("inventoryId", 228232);
		     data.put("partName", "string");
		     data.put("taskId", 25205);
		     data.put("itemTaskMapId", 30635);
		     data.put("qtyRequired", 2);
		     data.put("requestRemarks", "string");
		     data.put( "requestedDate", "2020-02-03T07:23:05.056Z");
		    
		 System.out.println( data+"\n");
		 
		     Response res=
		    		 given()
		    		    .contentType("application/json")
		    		    .body(data)
		    		 .when()
		    		   .post("https://scool360.com/fsm-webapi/api/requestPart")
		    		 .then()
		    		  // .statusCode(200)
			            .log().body().extract().response();
		     
		    
			  
	 }
	 
	 
	 //@Test
	 public void task_reAssign() {

	 	
	 	
	 	JSONObject jobj1= new JSONObject();
	 
	 	jobj1.put("inventoryId", 224730);
	 	jobj1.put("inventoryName", "string");
	 	jobj1.put("itemId", 5263);
	 	jobj1.put( "categoryId",75);
	 	jobj1.put("qty", 2);
	 	
	 	JSONObject jobj= new JSONObject();
	 	jobj.put("assignedUserId", 273);
	 	jobj.put("branchId", 42);
	 	jobj.put("details", jobj1);
	 	// create  request header and body
	 	
	 	RequestSpecification reqSpec= RestAssured.given();
	 			reqSpec.contentType(ContentType.JSON);
	 			reqSpec.body(jobj.toJSONString());
	 			
	 			
	 			Response resp= reqSpec.post("https://scool360.com/fsm-webapi/api/addInHandInventory");
	 			
	 			System.out.println("\n----------------displaying response header & Body-----------\n");
	 			System.out.println(resp.asString());
	 			//System.out.println("response : "+resp.prettyPeek());
	 			
	 			System.out.println("\n----------------displaying Status code-----------\n");
	 			System.out.println("response code: "+resp.getStatusCode());
	 			
	 			Assert.assertEquals(200, resp.getStatusCode());
	 			
	 }
	 	

}
