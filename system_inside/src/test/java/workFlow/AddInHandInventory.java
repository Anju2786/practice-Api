package workFlow;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddInHandInventory {
	
			  
	 
	 
	@Test
	 public void  workflow_addingInHandInventory() {
		 
		 List<Map<String,Object>> list=new ArrayList<>();
		 Map<String,Object> data=new HashMap();
//			 HashMap data1=new HashMap();
			 data.put("inventoryId", 224730);
			 data.put("inventoryName", "TOSHIBA");
			 data.put("itemId", 5263);
			 data.put( "categoryId",75);
			 data.put("qty", 0);
			 list.add(data);
			 
			 Map<String,Object> pdata=new HashMap();
			 pdata.put("assignedUserId", 278);
		     pdata.put("branchId", 22);
		     pdata.put("details", list);
		 System.out.println( pdata+"\n");
		 
		     Response response=null;
		    		try { 	
		    			response=RestAssured.given()
		    					.contentType("application/json")
				    		    .body(pdata)
				    		    .post("https://scool360.com/fsm-webapi/api/addInHandInventory")
				    		    .then()
					    		   .statusCode(200)
						            .log().body().extract().response();
		    			
		    		}
		    		    catch (Exception e) {
							// TODO: handle exception
						}
		    		
		    		   
//		    		 
		    		
		    		
//	 System.out.println("response"+response.asString());
//	 System.out.println("Status code"+response.getStatusCode());
//	 Assert.assertEquals(200, response.getStatusCode());
//	 
	 }}
	 
	 


