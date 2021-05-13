package sesson3.jv2;
import java.sql.*;
public class JdbcSelectTest {
    public static void main(String[] args) {
        try (
                // Step 1: Allocate a database 'Connection' object
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");   // For MySQL only
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection
                Statement stmt = conn.createStatement();
        ) {
            // Step 3: Execute a SQL SELECT query. The query result is returned in a 'ResultSet' object.
            String strSelect = "select title, price, qty from books";
            System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging

            ResultSet rset = stmt.executeQuery(strSelect);

            // Step 4: Process the ResultSet by scrolling the cursor forward via next().
            //  For each row, retrieve the contents of the cells with getXxx(columnName).
            System.out.println("The records selected are:");
            int rowCount = 0;
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int    qty   = rset.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);

            String select  = "select * from books";
            System.out.println("The SQL statement is :"+select+"\n");
            ResultSet sset = stmt.executeQuery( select );

            System.out.println("Print out a list");
            int rowCount1 = 0;
            while (sset.next()){
                int id = sset.getInt( "id" );
                String title = sset.getString("title");
                String author= sset.getString( "author" );
                double price = sset.getDouble("price");
                int    qty   = sset.getInt("qty");
                System.out.println(id+","+title + ", "+author+"," + price + ", " + qty);
                ++rowCount1;
            }

            String select1 = "select title,price from books where author = 'CodeLean VN'";
            System.out.println("The SQL statement is :"+select1+"\n");
            ResultSet s1set = stmt.executeQuery( select1 );

            System.out.println("Print out a list price title ");
            int rowCount2 = 0;
            while (s1set.next()){
                String title = s1set.getString("title");
                double price = s1set.getDouble("price");
                System.out.println(title + ", " + price );
                ++rowCount2;
            }

            String select3 = "select title,author,price,qty from books where author = 'CodeLean VN' or price>=30 order by price desc,id asc";
            System.out.println("The SQL statement is :"+select3+"\n");
            ResultSet s3set = stmt.executeQuery( select3 );

            System.out.println("Print out a list ");
            int rowCount3 = 0;
            while (s3set.next()){
                String title = s3set.getString("title");
                String author= s3set.getString( "author" );
                double price = s3set.getDouble("price");
                int    qty   = s3set.getInt("qty");
                System.out.println(","+title + ", "+author+"," + price + ", " + qty);
                ++rowCount3;
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }  // Step 5: Close conn and stmt - Done automatically by try-with-resources (JDK 7)
    }
}
