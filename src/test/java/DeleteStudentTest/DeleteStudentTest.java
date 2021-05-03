package DeleteStudentTest;

import DataProvider.DataProviderDeleteStudent;
import DataProvider.DataProviderPostStudent;
import io.restassured.response.Response;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteStudentTest {

    @Test(groups = "testingStudent")
    @Parameters({"deletedIDTestStudent"})
    public void deleteStudentTest(String deletedIDTestStudent){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .delete("http://localhost:8090/api/v1/student/" + deletedIDTestStudent)
                .then()
                .assertThat().statusCode(200)
                .extract().response();

        String responseString = response.asString();
        System.out.println(responseString);

    }
}
