package sesson2;

import java.util.Scanner;

public class bt2 {
    public static void main(String[]args){
       int Quantity1,Net;
       int Point;
       int Price1=300;
       int Price2=700;
       int Quantity2, Discount;
       int Total1,Total;
       int Total2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Shirts to order:");
        Quantity1 = scan.nextInt();
        System.out.println("Enter the number of Trousers to order:");
        Quantity2 = scan.nextInt();
        Total1 = Quantity1 * 300;
        Total2 = Quantity2 * 700;
        Total = (Total1+Total2);
        System.out.println();
        System.out.println("Item             Quantity          Piece        Total");
        System.out.println("Shirts"+"              "+Quantity1+"               "+"300"+"          "+Total1);
        System.out.println("Trousers"+"            "+Quantity2+"               "+"700"+"          "+Total2);
        System.out.println("-----------------------------------------------------------------------");
        if(Total>3000){
            Discount = (Total1 + Total2)/10;
            Net = (Total1 + Total2)-Discount;
            Point=0;
            System.out.println("Discount"+"                                          "+Discount);
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Net Total"+"                                        "+Net);
            if(Net>3000){
                Point= Net/100;
                System.out.println("Point Earned:  "+Point);
            }
            else{
                Point=0;
                System.out.println("Point Earned:  "+Point);
            }
        }
        else {
            Discount = 0;
            Net = Total1 + Total2;
            Point=0;
            System.out.println("Discount"+"                                         "+ Discount);
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Net Total"+"                                        "+Net);
            System.out.println("Point Earned"+Point);
        }

        System.out.println("Thanh You");
    }
}
