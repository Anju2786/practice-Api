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

public class GetInHandInventory {
	 @Test
	 public void  workflow_grtInHandInventory() {
		 List<Map<String,Object>> list=new ArrayList<>();
		 Map<String,Object> data1=new HashMap();
		 Map<String,Object> data=new HashMap();
		
			 data1.put("inventoryId", 224730);
			 data1.put("inventoryName", "TOSHIBA");
			 data1.put("itemId", 5263);
			 data1.put( "categoryId",75);
			 data1.put("qty", 2);
			 list.add(data1);
			 data.put("assignedUserId", 273);
		     data.put("branchId", 42);
		     data.put("details",list);
		 System.out.println( data+"\n");
		 Response res=null;
		 try {
		     res=RestAssured. given()
		    		
		    		    .contentType("application/json")
		    		    .body(data)
		    		 .when()
		    		   .post("https://scool360.com/fsm-webapi/api/getInHandInventory")
		    		 .then()
		    		  // .statusCode(200)
			            .log().body().extract().response();
		 }catch (Exception e) {
			// TODO: handle exception
		}
		    
			  
	 }
	 
	 
	

}
