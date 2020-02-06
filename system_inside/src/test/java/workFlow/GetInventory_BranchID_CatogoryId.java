package workFlow;

import org.testng.Reporter;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetInventory_BranchID_CatogoryId {

	@Test
	
	public void getInventory_Branch_Catogory() {
		System.out.println("get catogeries");
		given()
		 .when()
		   .get("https://scool360.com/fsm-webapi/api/getInventory/22/138")
		 
		 .then()
		     .statusCode(200)
		     .log().body();
		
	}

}

