package PutTeacherTest;

import io.restassured.response.Response;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutTeacherTest {


    @Test(groups = "testingTeacher")
    @Parameters({"putIDTestTeacher","nameChangeTeacher","emailChangeTeacher","cuiTeacher"})
    public void putStudentTest(String putIDTestTeacher,String nameChangeTeacher,String emailChangeTeacher,String cuiTeacher){


        Response response = given()
                .header("Content-Type", "application/json")
                .queryParams("cui",cuiTeacher)
                .queryParams("name",nameChangeTeacher)
                .queryParams("email",emailChangeTeacher)
                .when()
                .put("http://localhost:8090/api/v1/student/" + putIDTestTeacher)
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response();

        String responseString = response.asString();
        System.out.println(responseString);

    }

}
