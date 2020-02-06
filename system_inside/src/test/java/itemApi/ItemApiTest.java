package itemApi;


import org.apache.commons.collections4.map.HashedMap;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.And;
import com.aventstack.extentreports.model.Log;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

public class ItemApiTest {
	
	@Test
	public void test_GetAllItem()
	{
		Response response=RestAssured.get("https://scool360.com/fsm-webapi/api/allItems/289641");
		//get response headers
//		System.out.println("response header "+response.getHeaders());
		//get response body
		System.out.println(" response body "+response.getBody().prettyPeek());
		//get response status code
//		System.out.println("Status code "+response.getStatusCode());
		//get response content type
//		System.out.println("response content type "+response.getContentType());
		//get time taken to get a response
//		System.out.println("response time "+response.getTime());
	 
		
		 int statusCode = response.getStatusCode();
		
//		 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
		// System.out.println("ljlkjlk" +response);
		
	}
	//@Test(priority=1)
	public void getAllItem() {
		 given().
		    when().
		        get("https://scool360.com/fsm-webapi/api/allItems/289641").
		    then().
		        assertThat().
		        statusCode(200).
		        and().
		     	 contentType(ContentType.JSON);
		   
	}

	
	
	//@Test(priority=2)
	
	public void PostData() {

		
		JSONObject jobj= new JSONObject();
		jobj.put("statuscode","200");
		jobj.put("message","Success");
		jobj.put("responseData", "true");
		
		// create  request header and body
		
		RequestSpecification reqSpec= RestAssured.given();
				reqSpec.contentType(ContentType.JSON);
				reqSpec.body(jobj.toJSONString());
				
				Response resp= reqSpec.post("https://scool360.com/fsm-webapi/api/uploadDocs");
				System.out.println(resp.asString());
				
				Assert.assertEquals(200, resp.getStatusCode());
	}
	
	
}
