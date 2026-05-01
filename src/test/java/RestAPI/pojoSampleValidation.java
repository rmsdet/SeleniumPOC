package RestAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojo.user;
import pojo.userResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class pojoSampleValidation {

    @Test
    public void createUserUsingPOJO() {

        RestAssured.baseURI = "https://reqres.in";

        // Step 1: Creates POJO object
        user user = new user("Ajay", "QA Engineer");

        // Step 2: API call with headers + POJO body
        userResponse response = //response stores API response data
            given()
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres_dfb885e240a04999a4bc1f4e85a450c7")
                .contentType(ContentType.JSON)
                .body(user)
            .when()
                .post("/api/users")
            .then()
                .statusCode(201)
                .extract()
                .as(userResponse.class);

        // Step 3: Print response values
        System.out.println("ID: " + response.getId());
        System.out.println("Created At: " + response.getCreatedAt());

        // Step 4: Assertions (optional)
        assert response.getName().equals("Ajay");
        assert response.getJob().equals("QA Engineer");
    }
}