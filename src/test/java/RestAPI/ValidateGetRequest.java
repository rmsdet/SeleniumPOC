package RestAPI;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import BaseAPI.ApiBaseTest;
import static io.restassured.RestAssured.*;
//import ApiBaseTest;
import spec.SpecBuilder;

public class ValidateGetRequest extends ApiBaseTest {
	
	    @Test
	    public void getPostById() {

	        given()
	            .spec(SpecBuilder.getRequestSpec())
	            .log().all()
	        .when()
	            .get()
	        .then()
	            .log().all()
	            .statusCode(200)
	            .body("id", equalTo(1))
	            .body("userId", notNullValue())
	            .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
	            .body("body", containsString("quia et suscipit"));
	    }
	}


