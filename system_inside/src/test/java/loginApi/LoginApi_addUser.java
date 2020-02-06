package loginApi;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApi_addUser {
	
@Test
public void addUser_login() {

	JSONObject jobj= new JSONObject();
//	jobj.put( "userName", "string");
//	jobj.put("emailId", "string");
//	jobj.put( "password", "string");
//	
	jobj.put( "userName", "Rimo");
	jobj.put("emailId", "rimo@gmail.com");
	jobj.put( "password", "rimo@123");
	
	// create  request header and body
	
	RequestSpecification reqSpec= RestAssured.given();
			reqSpec.contentType(ContentType.JSON);
			reqSpec.body(jobj.toJSONString());
			
			Response resp= reqSpec.post("https://scool360.com/fsm-webapi/api/addUser");
			
			System.out.println(resp.asString());
			System.out.println(resp.getStatusCode());
			Assert.assertEquals(200, resp.getStatusCode());
			
}
	
}


