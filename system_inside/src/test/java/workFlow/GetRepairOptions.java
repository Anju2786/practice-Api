package workFlow;

import org.testng.Reporter;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetRepairOptions {

	@Test
	
	public void getworkflow_RepairOption() {
		System.out.println("----get work flow RepairOption------");
		given()
		 .when()
		   .get("https://scool360.com/fsm-webapi/api/getRepairOptions")
		 
		 .then()
		     .statusCode(200)
		    
		
		    .log().body();
		
	}

}

