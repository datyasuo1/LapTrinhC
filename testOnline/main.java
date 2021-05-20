package testOnline;



import eBookShop.Controllers.RegisterController;
import eBookShop.Models.User;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        boolean quit = false;

        while (!quit) {
            Scanner scanner = new Scanner( System.in );
            System.out.println( "\nEnter action:(3 to show available action" );
            int action = Integer.parseInt( scanner.nextLine() );
            scanner.nextLine();
            switch (action) {

                case 1:
                    register rg = new register();
                    user user = rg.signIn();
                    break;
                case 2:
                    createAccount();
                    break;
                case 3:
                    System.out.println( "Byeeeeeeee" );
                    quit = true;
                    break;
            }
        }
    }

    public static void createAccount() {

        Scanner input = new Scanner( System.in );
        System.out.println( "Enter your account:" );
        String name = input.nextLine();
        System.out.println( "Enter your password:" );
        String password = input.nextLine();
        System.out.println( "Enter your role: (1-customer, 2-admin)" );
        int type = Integer.parseInt( input.nextLine() );

        user obj = new user( name, password, type );

        register signUp = new register();
       signUp.signup( obj );
    }
}