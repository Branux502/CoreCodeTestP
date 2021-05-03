package DataProvider;

import org.json.JSONObject;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DataProviderPostStudent {


    @DataProvider(name = "postStudents", parallel = false)
    public Iterator<Object[]> postStudents() {
        Collection<Object[]> data = new ArrayList<>();
        for (int i = 1; i < 20; i++){
            JSONObject bodyContent = new JSONObject();
            bodyContent.put("name","TestUser#"+i);
            bodyContent.put("email","testemail"+i+"@gmail.com");
            bodyContent.put("dob","2000-10-10");

            data.add(new Object[]{bodyContent.toString()});
        }
        return data.iterator();
    }
}
