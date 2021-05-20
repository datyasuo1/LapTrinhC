package testOnline;



import eBookShop.Models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class register {
   List<user> userList = new ArrayList<>();
    public List<user> loading() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testonline", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from users";
            ResultSet rset = stmt.executeQuery(select);
            while (rset.next()) {
                user obj = new user();
                obj.setUserID(rset.getInt("userID"));
                obj.setName(rset.getString("name"));
                obj.setPass(rset.getString("password"));
                obj.setType(rset.getInt("type"));
                obj.setCreatedate(rset.getString("createddate"));
                obj.setUpdatedate(rset.getString("updateddate"));
                userList.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return userList;
    }
    public boolean signup(user user){
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testonline", "root", "");
                Statement stmt = conn.createStatement();
        ){

            String signup = "insert into users(name,pass,type,creatdate) values('" + user.getName() + "','" + user.getPass() + "'," + user.getType() + "," + "CURRENT_DATE())";

            stmt.executeUpdate(signup);
            loading();
            System.out.println("Signup successfully");
            return true;
        }catch (SQLException ex) {
            ex.printStackTrace();
            return  false;
        }
    }
    public user signIn() {
        user obj = new user();
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your username: ");
            String name = input.nextLine();
            System.out.println("Enter your password: ");
            String pass = input.nextLine();
            String select = "Select * from users where name ='" + name + "' AND pass ='" + pass + "'";
            ResultSet rset = stmt.executeQuery(select);
            int row = 0;
            while (rset.next()) {
                int id = rset.getInt("userID");
                String name1 = rset.getString("name");
                String pass1=rset.getString("password");
                int type=rset.getInt("type");
                String createddate = rset.getString("createddate");
                String updateddate=rset.getString("updateddate");
                obj = new user(id,name1,pass1,type,createddate,updateddate);
                ++row;
            }
            if(row==0){
                System.out.println("Wrong username or password");
            }else
                System.out.println("Sign in successfully");
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return obj;
    }
    public void displayUser(){
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testonline", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String stt = "Select * from users";
            ResultSet rset = stmt.executeQuery(stt);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColums = rsetMD.getColumnCount();
            for (int i = 1; i <= numColums; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            loading();
            for(int i = 0; i< userList.size(); i++){
                System.out.println(userList.get(i).toString());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}