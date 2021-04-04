package sesson2;

import java.util.Scanner;

public class bt3 {
    public static void main(String[]args) {
        int h;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chieu cao:");
        h = scan.nextInt();
        if(h>0) {
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= 2 * h-1; j++) {
                   if((j>=h-i+1) && (j<=h+i-1)){
                       System.out.print(" * ");
                   }else{
                       System.out.print("   ");
                   }
                }
                System.out.print("\n");
            }

        }else{
            System.out.println("Nhap lai h");
        }
    }
}
