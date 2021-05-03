package GetStudentTest;

import IntegrationTest.Student;
import com.google.gson.Gson;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetStudentTest {

    @Test(groups = "testingStudent")
    public void getAllStudent(){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:8090/api/v1/student")
                .then()
                .assertThat().statusCode(200)
                .extract().response();


        String responseString = response.asString();

        Gson gsonGetStudents = new Gson();

        Student[] students = gsonGetStudents.fromJson(responseString,Student[].class);
        for (Student student : students) {
            System.out.println(student.getId());
            System.out.println(student.getEmail());
            System.out.println(student.getName());
            System.out.println(student.getDob());
            System.out.println(student.getAge());
        }
    }

}
