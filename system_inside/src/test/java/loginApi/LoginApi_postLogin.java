package loginApi;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApi_postLogin {
	
@Test
public void postLoginDescription() {

	JSONObject jobj= new JSONObject();
	jobj.put(" roleId", 12);
	jobj.put("userId", 14);
	jobj.put("engineerId", 7847);
	jobj.put("userName", "ABC");
	jobj.put( "fullName", "XYZ");
	jobj.put( "emailId", "abc123@gmail.com");
	jobj.put( "password", "abc@123");
	jobj.put("branchId", 24);
	jobj.put( "branchName", "mnop");
	
	// create  request header and body
	 Response response=null;
		try { 	
			response=RestAssured.given()
					.contentType("application/json")
	    		    .body(jobj)
	    		    .post("https://scool360.com/fsm-webapi/api/login")
	    		    .then()
		    		   .statusCode(200)
			            .log().body().extract().response();
			
		}
		    catch (Exception e) {
				// TODO: handle exception
			}
		
		   
//		 
		
		
System.out.println("response"+response.asString());
System.out.println("Status code"+response.getStatusCode());
Assert.assertEquals(200, response.getStatusCode());


	
}
}

