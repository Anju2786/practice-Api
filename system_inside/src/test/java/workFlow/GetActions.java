package workFlow;

import org.testng.Reporter;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetActions {

	@Test
	
	public void getworkflowActions() {
		System.out.println("----get work flow Actions------");
		given()
		 .when()
		   .get("https://scool360.com/fsm-webapi/api/getActions")
		 
		 .then()
		     .statusCode(200)
		    
		
		    .log().body();
		
	}

}

