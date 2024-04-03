package apiauto;

import io.restassured.RestAssured;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestReqres {
@Test
    public void testGetListUsers () {
    given().when()
            .get("https://reqres.in/api/users?page=2")
            .then().log().all()
            .assertThat()
            .statusCode(200)
            .body("page", equalTo(2))
            .body("per_page", equalTo(6))
            .body("total", equalTo(12));
}

public void testPostCreateUser () {

}
}
