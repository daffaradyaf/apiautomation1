package apiauto;

import io.restassured.RestAssured;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class TestReqres {
@Test
    public void testGetListUsers () {
    RestAssured.given().when().get("https://reqres.in/api/users?page=2")
            .then().log().all()
            .assertThat().statusCode(200).assertThat("per_page", Matchers.equalTo(6))
            .assertThat("page", Matchers.equalTo(2));
}

public void testPostCreateUser () {

}
}
