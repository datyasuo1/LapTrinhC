package Thi;

import java.util.Scanner;

public class TestFight {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("Nhap so hieu chuyen bay");
        int number = scan.nextInt();
        System.out.println("Nhap noi muon den");
        String destination = scan.next();
        Fight f1 = new Fight(number,destination);
        f1.display();
    }
}
