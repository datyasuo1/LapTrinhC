package sesson3.jv2;
import java.sql.*;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the min price:");
        float min = scan.nextFloat();
        System.out.println("enter the max price:");
        float max = scan.nextFloat();
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String products = "select ProductName from products \nWHERE "+ min+" <UnitPrice || UnitPrice< "+max+";";
            System.out.println("The SQL statement is: "+ products+"\n");
            ResultSet print = stmt.executeQuery(products);
            while (print.next()){
                String ProductName = print.getString("ProductName");
                System.out.println(ProductName);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
