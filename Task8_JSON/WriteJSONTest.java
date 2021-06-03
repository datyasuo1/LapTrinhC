package Task8_JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put( "firstName", "Dang" );
        employeeDetails.put( "lastname", "Kim Thi" );
        employeeDetails.put( "website", "codelean.vn" );

        JSONObject employeeObject = new JSONObject();
        employeeObject.put( "employee", employeeDetails );

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put( "firstName", "Code" );
        employeeDetails2.put( "lastname", "Lean" );
        employeeDetails2.put( "website", "codelean.com" );

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put( "employee", employeeDetails2 );

        JSONArray employeeList = new JSONArray();
        employeeList.add( employeeObject );
        employeeList.add( employeeDetails2 );

        try (FileWriter file = new FileWriter( "employee.json" )) {
            file.write( employeeList.toJSONString() );
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
