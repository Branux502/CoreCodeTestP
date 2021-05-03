package DeleteTeacherTest;

import io.restassured.response.Response;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteTeacherTest {
    @Test(groups = "testingTeacher")
    @Parameters({"deletedIDTestTeacher"})
    public void deleteTeacherTest(String deletedIDTestTeacher){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .delete("http://localhost:8090/api/v1/teacher/" + deletedIDTestTeacher)
                .then()
                .assertThat().statusCode(200)
                .extract().response();

        String responseString = response.asString();
        System.out.println(responseString);

    }
}
