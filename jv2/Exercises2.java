package sesson3.jv2;
import java.sql.*;

public class Exercises2 {
    public static void main(String[] args) {
        try (

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root","" );
        Statement stmt = conn.createStatement();
        ) {
            String customer = "select * from customers";
            System.out.println( "The SQL statement is :" + customer + "\n" );
            ResultSet cset = stmt.executeQuery( customer );
            while (cset.next()) {
                String CustomerID = cset.getString( "CustomerID" );
                String CompanyName = cset.getString( "CompanyName" );
                String ContactName = cset.getString( "ContactName" );
                String ContactTitle = cset.getString( "ContactTitle" );
                String Address = cset.getString( "Address" );
                String City = cset.getString( "City" );
                String Region = cset.getString( "Region" );
                String PostalCode = cset.getString( "PostalCode" );
                String Country = cset.getString( "Country" );
                String Phone = cset.getString( "Phone" );
                String Fax = cset.getString( "Fax" );
                System.out.println( CustomerID + " , " + CompanyName + " , " +
                        ContactName + " , " + ContactTitle + " , " + Address + " , " +
                        City + " , " + Region + " , " + PostalCode + " , " + Country + " , " +
                        Phone + " , " + Fax );
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}
