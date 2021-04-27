package Task10;

import java.util.Scanner;

public class MiniGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("Nhap ten meo");
        String name = scan.nextLine();
        System.out.println("Nhap toc do cua meo");
        int speed = scan.nextInt();
        Cat cat = new Cat( name, speed );

        System.out.println("Nhap ten chuot");
        String name1 = scan.next();
        System.out.println("Nhap toc do cua chuot");
        int speed1 = scan.nextInt();
        System.out.println("Nhap can nang");
        int weight = scan.nextInt();
        Rat rat = new Rat( name1, speed1,weight );

        if (cat.getSpeed()<=rat.getSpeed()){
            rat.run();
            System.out.println("moa' chay nhanh vcll!");
            System.out.println("Bat tiep de");
        }else {
            cat.run();
            Rat rat2 = new Rat( weight );
            Cat cat2 = new Cat( rat2 );
            cat2.eat( rat2 );
            System.out.println("lum. tui. no' het' tron r GG");
        }
    }
}
