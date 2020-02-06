package loginApi;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApi_test5{
	
@Test
public void SendLogMail() {

	JSONObject jobj= new JSONObject();


	jobj.put("engineerId", 7847);
	jobj.put("branchId", 24);
	jobj.put( "callLogNo", "ps15");
	
	// create  request header and body
	
	RequestSpecification reqSpec= RestAssured.given();
			reqSpec.contentType(ContentType.JSON);
			reqSpec.body(jobj.toJSONString());
			
			Response resp= reqSpec.post("https://scool360.com/fsm-webapi/api/sendCallLogMail");
			
			System.out.println(resp.prettyPeek());
			System.out.println(resp.getHeaders());
			
			System.out.println(resp.getStatusCode());
			Assert.assertEquals(200, resp.getStatusCode());
			
}
	
}


