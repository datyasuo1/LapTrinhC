package sesson5jv2;

import java.sql.*;
import java.util.Scanner;

public class MainDrink {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/drinkshop", "root", "" );
                Statement stmt = conn.createStatement();
        ){
        boolean quit = false;
        while (!quit){
            System.out.println("\nEnter action:(6 to show available action");
            int action = Integer.parseInt( scanner.nextLine() );
            scanner.nextLine();
            switch (action){

                case 1:
                    System.out.println("Danh sách đồ uống");
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

                    break;
                case 2:
                    System.out.println("Nhập tên đồ uống muốn thêm vào");
                    String dName = scanner.nextLine();
                    System.out.println("Nhập tên id");
                    int dId = Integer.parseInt( scanner.nextLine() );
                    System.out.println("Nhập tên thương hiệu");
                    String dBrand = scanner.nextLine();
                    System.out.println("Nhập giá");
                    double dPrice = Integer.parseInt( scanner.nextLine() );
                    String insert = "insert into drinks values(?,?,?,?)";
                    PreparedStatement pstmt =conn.prepareStatement( insert );
                    pstmt.setInt( 1,dId );
                    pstmt.setString( 2,dName );
                    pstmt.setString( 3,dBrand );
                    pstmt.setDouble( 4,dPrice );
                    int rowInserted = pstmt.executeUpdate();
                    System.out.println(rowInserted+"Thêm vào thành công");
                    String check = "select * from drinks WHERE name = '"+ dName +"';";
                    ResultSet drink = stmt.executeQuery( check );
                    ResultSetMetaData drinkMD = drink.getMetaData();
                    int numColums1 = drinkMD.getColumnCount();
                    for (int i = 1; i <= numColums1; ++i) {
                        System.out.printf( "%-30s", drinkMD.getColumnName( i ) );
                    }
                    System.out.println();

//                    while (drink.next()) {
//                        for (int i = 1; i <= numColums1; ++i) {
//                            System.out.printf( "%-30s", drink.getString( i ) );
//                        }
//                        System.out.println();
//                    }
                    break;
                case 3:
                    System.out.println("Nhập tên đồ uống");
                    String name = scanner.nextLine();
                    System.out.println("Nhập id");
                    int id = Integer.parseInt( scanner.nextLine() );
                    System.out.println("Nhập thương hiệu");
                    String brand = scanner.nextLine();
                    System.out.println("Nhập giá");
                    double price = Integer.parseInt( scanner.nextLine() );
                    String update = "update drinks"+"set name=?,brand=?,price=?"+"where id=?";
                    PreparedStatement pstmt1 = conn.prepareStatement( update );
                    conn.setAutoCommit( false );
                    pstmt1.setString( 1,name );
                    pstmt1.setString( 2,brand );
                    pstmt1.setDouble( 3,price );
                    pstmt1.setInt( 4,id );
                    pstmt1.addBatch();
                    System.out.println("Đồ uống đã được cập nhật thành công");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Nhập tên đồ uống cần tìm");
                    String name1 = scanner.nextLine();
                    String check1 = "select * from drinks where name='"+name1+"'";
                    ResultSet pset = stmt.executeQuery( check1 );
                    int count = 0;
                    while (pset.next()){
                        ++count;
                    }
                    if (count>=1){
                        ResultSetMetaData drinks2MD = pset.getMetaData();
                        int numColums2 = drinks2MD.getColumnCount();
                        for (int i = 1; i <= numColums2; i++) {
                            System.out.printf("%-30s", drinks2MD.getColumnName(i));
                        }
                        System.out.println();
                        while (pset.next()) {
                            for (int i = 1; i <= numColums2; i++) {
                                System.out.printf("%-30s", pset.getString(i));
                            }
                            System.out.println();
                        }
                    }else
                        System.out.println(name1+"không tồn tại trong danh sách");

                    break;
                case 5:
                    System.out.println("Name drink:");
                    String name4 = scanner.nextLine();
                    String delete4 = "DELETE FROM drinks WHERE name ='"+name4+"';";
                    PreparedStatement pstmt4 = conn.prepareStatement(delete4);
                    pstmt4.executeUpdate();
                    System.out.println("DELETED!");
                    break;
                case 6:
                    System.out.println("\nShutting down");
                    quit = true;
                    break;
            }

        }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
