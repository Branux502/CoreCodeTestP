package PostStudentTest;

import DataProvider.DataProviderPostStudent;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostStudentTest {

    @Test(dataProvider = "postStudents",dataProviderClass = DataProviderPostStudent.class,groups = "testingStudent")
    public void postStudentTest(String bodyContent){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(bodyContent.toString())
                .post("http://localhost:8090/api/v1/student/")
                .then()
                .assertThat().statusCode(200)
                .extract().response();

        String responseString = response.asString();
        System.out.println(responseString);

    }

}
