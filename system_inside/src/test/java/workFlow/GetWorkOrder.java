package workFlow;

import org.testng.Reporter;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetWorkOrder {

	@Test
	
	public void getworkflow_workOrder_itemMaskId() {
		System.out.println("----get work flow Work Order by Item MaskID------");
		given()
		 .when()
		   .get("https://scool360.com/fsm-webapi/api/getWorkOrder/30635")
		 
		 .then()
		     .statusCode(200)
		    
		
		    .log().body();
		
	}

}

