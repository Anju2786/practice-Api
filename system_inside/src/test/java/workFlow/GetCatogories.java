package workFlow;

import org.testng.Reporter;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetCatogories {

	@Test
	
	public void get_Catogories() {
		System.out.println("get catogeries");
		given()
		 .when()
		   .get("https://scool360.com/fsm-webapi/api/getCategories")
		 
		 .then()
		     .statusCode(200)
		     .log().body();
		
	}

}

