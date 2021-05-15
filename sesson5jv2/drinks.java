package sesson5jv2;

import java.sql.*;
import java.util.Scanner;

public class drinks {

    public static void main(String[] args) {

            try (
                    Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/drinkshop", "root", "" );
                    Statement stmt = conn.createStatement();
            ){

                    ResultSet dset = stmt.executeQuery( "select * from drinks" );
                    ResultSetMetaData dsetMD = dset.getMetaData();
                    int numColums = dsetMD.getColumnCount();
                for (int i = 1; i <= numColums; ++i) {
                    System.out.printf( "%-30s", dsetMD.getColumnName( i ) );
                }
                System.out.println();

                while (dset.next()) {
                    for (int i = 1; i <= numColums; ++i) {
                        System.out.printf( "%-30s", dset.getString( i ) );
                    }
                    System.out.println();
                }
            }catch (SQLException ex) {
                ex.printStackTrace();
        }
    }
}