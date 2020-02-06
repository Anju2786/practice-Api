package workFlow;

import org.testng.Reporter;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetClosingDetails_ItemMaskId {

	@Test
	
	public void getworkflow_GetClosingDetails() {
		System.out.println("----get work flow closing Details by Item MaskId------");
		given()
		 .when()
		   .get("https://scool360.com/fsm-webapi/api/getClosingDetails/452536")
		 
		 .then()
		     .statusCode(200)
		    
		
		    .log().body();
		
	}

}

