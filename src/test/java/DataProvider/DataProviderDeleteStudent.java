package DataProvider;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderDeleteStudent {

    @DataProvider(name = "deleteStudent", parallel = false)
    public Iterator<Object[]> deleteStudent(){
        List<Object[]> values = new ArrayList<Object[]>();
        for(int i = 1; i <= 5;i++){
            values.add(new Object[]{i});
        }
        return  values.iterator();
    }
}
