package loginApi;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApi_findUser {
	
@Test
public void findUser_login() {

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
	
	 Response response=null;
	
	 
		try { 	
			response=RestAssured.given()
					.contentType("application/json")
	    		    .body(jobj)
	    		    .post("https://scool360.com/fsm-webapi/api/findUser")
	    		    .then()
		    		   .statusCode(200)
			            .log().body().extract().response();
			
		}
		    catch (Exception e) {
		    }
			
			
			System.out.println(response.asString());
			System.out.println(response.getStatusCode());
			Assert.assertEquals(200, response.getStatusCode());
			
}
	
}


	


