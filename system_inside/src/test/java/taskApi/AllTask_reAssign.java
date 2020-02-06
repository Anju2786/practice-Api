package taskApi;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AllTask_reAssign {
	
@Test
public void task_reAssign() {

	JSONObject jobj= new JSONObject();
//	jobj.put( ""requestId": 0,");
//	jobj.put("emailId", "string");
//	jobj.put( "password", "string");
//	
	jobj.put( "requestId",120);
	jobj.put("taskId",289641);
	jobj.put( "engineerId", 293);
	jobj.put( "branchId", 42);
	jobj.put( "requestRemarks", "string");
	jobj.put( "requestedDate", "2020-01-31T04:42:52.339Z");
	
	// create  request header and body
	
	RequestSpecification reqSpec= RestAssured.given();
			reqSpec.contentType(ContentType.JSON);
			reqSpec.body(jobj.toJSONString());
			
			Response resp= reqSpec.post("https://scool360.com/fsm-webapi/api/task/reAssign");
			
			System.out.println("\n----------------displaying response header & Body-----------\n");
			//System.out.println(resp.asString());
			System.out.println("response : "+resp.prettyPeek());
			
			System.out.println("\n----------------displaying Status code-----------\n");
			System.out.println("response time: "+resp.getStatusCode());
			
			Assert.assertEquals(200, resp.getStatusCode());
			
}
	
}


