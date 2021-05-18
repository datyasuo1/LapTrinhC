package giftShop.giftView;
import giftShop.giftController.GiftController;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class giftShop {
    public static void main(String[] args) {
        System.out.println("Welcome to E-GiftShop!!!");
        System.out.println("============================================================");


        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Display gift in store.");
        System.out.println("2. Insert new gift in GiftList.");
        System.out.println("3. Delete gift for GiftList.");
        System.out.println("4. Exit");
        while (!quit) {
            System.out.println( "\nEnter action:(4 to show available action" );
            int action = Integer.parseInt( scanner.nextLine() );
            scanner.nextLine();
            switch (action) {

                case 1:
                    GiftController gctl = new GiftController();
                    gctl.displayGift();
                    break;
                case 2:
                    GiftController gctl1 = new GiftController();
                    gctl1.addGift();
                    break;
                case 3:
                    GiftController gctl3 = new GiftController();
                    gctl3.deleteGf();
                    break;
                case 4:
                    System.out.println( "Byeeeeeeee" );
                    quit = true;
                    break;
                }
            }
        }
    }
