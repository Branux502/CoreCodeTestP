package PostTeacherTest;

import DataProvider.DataProviderPostStudent;
import DataProvider.DataProviderPostTeacher;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostStudentTest {

    @Test(dataProvider = "postTeachers",dataProviderClass = DataProviderPostTeacher.class,groups = "testingTeacher")
    public void postStudentTest(String bodyContent){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(bodyContent.toString())
                .post("http://localhost:8090/api/v1/teacher/")
                .then()
                .assertThat().statusCode(200)
                .extract().response();

        String responseString = response.asString();
        System.out.println(responseString);

    }

}
