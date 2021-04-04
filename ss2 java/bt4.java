package sesson2;

import java.util.Scanner;

public class bt4 {
    public static void main(String[]args){
        int h;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so hang;");
        h= scan.nextInt();
        if(h>0){
            for(int i =1; i<=h; i++){
                for(int j=1;j<=2*h+1;j++){
                    System.out.print("|---");
                }
                System.out.print("\n");
            }
        }
        else {
            System.out.println("Nhap lai so hang");
        }
    }
}
