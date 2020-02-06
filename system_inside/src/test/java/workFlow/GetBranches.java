package workFlow;

import org.testng.Reporter;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetBranches {

	@Test
	
	public void get_Branches() {
		System.out.println("get Branches");
		given()
		 .when()
		   .get("https://scool360.com/fsm-webapi/api/getBranches")
		 
		 .then()
		     .statusCode(200)
		     .log().body();
		
	}

}
