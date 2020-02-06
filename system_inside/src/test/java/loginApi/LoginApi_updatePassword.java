package loginApi;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApi_updatePassword {
	
@Test
public void updatePassword() {

	JSONObject jobj= new JSONObject();

//	jobj.put("emailId", "string");

	
	
	jobj.put("emailId", "rimo@gmail.com");
	jobj.put( "password", "rimo123#");
	
	
	// create  request header and body
	
	RequestSpecification reqSpec= RestAssured.given();
			reqSpec.contentType(ContentType.JSON);
			reqSpec.body(jobj.toJSONString());
			
			Response resp= reqSpec.post("https://scool360.com/fsm-webapi/api/updatePassword");
	
		System.out.println(resp.peek());
			//System.out.println(resp.getHeaders());
			
			System.out.println(resp.getStatusCode());
			Assert.assertEquals(405, resp.getStatusCode());
			
}
	
}


