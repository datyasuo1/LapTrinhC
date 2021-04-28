package Thi;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank(1000,10);
        System.out.println(bank.toString());
        Scanner scan = new  Scanner(System.in);
        System.out.println("enter balance");
        double balance = scan.nextDouble();
        System.out.println("enter rate");
        double rate = scan.nextDouble();
        Bank bank1 = new  Bank(balance,rate);
        System.out.println(bank1.toString());
    }
}
