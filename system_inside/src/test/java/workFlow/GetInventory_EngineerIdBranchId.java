package workFlow;

import org.testng.Reporter;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetInventory_EngineerIdBranchId {

	@Test
	
	public void getworkflow_Inventory_EngineerIdBranchId() {
		System.out.println("----get work flow Inventory by EngineerIdBranchId------");
		given()
		 .when()
		   .get("https://scool360.com/fsm-webapi/api/inventory/getRequests/293/42")
		 
		 .then()
		     .statusCode(200)
		    
		
		    .log().body();
		
	}

}

