package PutStudentTest;

import DataProvider.DataProviderDeleteStudent;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutStudentTest {


    @Test(groups = "testingStudent")
    @Parameters({"putIDTestStudent","nameChangeStudent","emailChangeStudent"})
    public void putStudentTest(String putIDTestStudent,String nameChangeStudent,String emailChangeStudent){


        Response response = given()
                .header("Content-Type", "application/json")
                .queryParams("name",nameChangeStudent)
                .queryParams("email",emailChangeStudent)
                .when()
                .put("http://localhost:8090/api/v1/student/" + putIDTestStudent)
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response();

        String responseString = response.asString();
        System.out.println(responseString);

    }
}
