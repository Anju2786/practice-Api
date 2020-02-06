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

public class AddExpenses {
	
			  
	 
	 
	@Test
	 public void  workflow_expnses() {
		 
		 List<Map<String,Object>> list=new ArrayList<>();
		 Map<String,Object> data=new HashMap();
//			 HashMap data1=new HashMap();
			 data.put("expenseId", 25);
			 data.put("expenseItem", "TOSHIBA");
			 data.put("qty", 1);
			 data.put( "categoryId",75);
			 data.put("qty", 0);
			 data.put("price", 250);
			 list.add(data);
			 
			 Map<String,Object> pdata=new HashMap();
			 pdata.put("assignedUserId", 293);
		     pdata.put("branchId", 42);
		     pdata.put( "taskId", 25205);
		     pdata.put("details", list);
		 System.out.println( data+"\n");
		 
		     Response response=null;
		    		try { 	
		    			response=RestAssured.given()
		    					.contentType("application/json")
				    		    .body(pdata)
				    		    .post("https://scool360.com/fsm-webapi/api/addExpenses")
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
	 
	 
	//@Test
//	 public void task_reAssign() {
//
//	 	
//	 	
//	 	JSONObject jobj1= new JSONObject();
//	 
//	 	jobj1.put("inventoryId", 224730);
//	 	jobj1.put("inventoryName", "string");
//	 	jobj1.put("itemId", 5263);
//	 	jobj1.put( "categoryId",75);
//	 	jobj1.put("qty", 2);
//	 	
//	 	JSONObject jobj= new JSONObject();
//	 	jobj.put("assignedUserId", 293);
//	 	jobj.put("branchId", 42);
//	 	jobj.put("details", jobj1);
//	 	// create  request header and body
//	 
//	 	Response resp= null;
//	 	try{
//	 		resp=RestAssured.given();
//	 	
//	 	
//	 			.contentType(ContentType.JSON)
//	 			.body(jobj.toJSONString())
//	 			
//	 			
//	 			reqSpec.post("https://scool360.com/fsm-webapi/api/addInHandInventory");
//	 	}catch (Exception e) {
//			// TODO: handle exception
//		}
//	 			System.out.println("\n----------------displaying response header & Body-----------\n");
//	 			System.out.println(resp.asString());
//	 			//System.out.println("response : "+resp.prettyPeek());
//	 			
//	 			System.out.println("\n----------------displaying Status code-----------\n");
//	 			System.out.println("response code: "+resp.getStatusCode());
//	 	}
//	 			Assert.assertEquals(200, resp.getStatusCode());
//	 			
//	 }
//	 	
//
//}
