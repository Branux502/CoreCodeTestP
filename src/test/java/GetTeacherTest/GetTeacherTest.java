package GetTeacherTest;

import IntegrationTest.Student;
import IntegrationTest.Teacher;
import com.google.gson.Gson;
import io.restassured.response.Response;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetTeacherTest {

    @Test(groups = "testingTeacher")
    public void getAllTeacher(){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:8090/api/v1/teacher")
                .then()
                .assertThat().statusCode(200)
                .extract().response();


        String responseString = response.asString();

        Gson gsonGetTeachers = new Gson();

        Teacher[] teachers = gsonGetTeachers.fromJson(responseString,Teacher[].class);
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getId());
            System.out.println(teacher.getCui());
            System.out.println(teacher.getName());
            System.out.println(teacher.getEmail());
            System.out.println(teacher.getDob());
            System.out.println(teacher.getAge());
        }
    }

}
