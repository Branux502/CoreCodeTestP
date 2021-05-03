package DataProvider;

import org.json.JSONObject;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DataProviderPostTeacher {

    @DataProvider(name = "postTeachers", parallel = false)
    public Iterator<Object[]> postTeachers() {
        Collection<Object[]> data = new ArrayList<>();
        for (int i = 10; i < 30; i++){
            JSONObject bodyContent = new JSONObject();
            bodyContent.put("cui","3019179"+i+"0101");
            bodyContent.put("name","TeacherTestUser#"+i);
            bodyContent.put("email","teachertestemail"+i+"@gmail.com");
            bodyContent.put("dob","1995-01-20");

            data.add(new Object[]{bodyContent.toString()});
        }
        return data.iterator();
    }
}
