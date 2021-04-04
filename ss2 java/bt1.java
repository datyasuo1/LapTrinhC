package sesson2;

import java.util.Scanner;

public class bt1 {
    public static void main(String[]args){
        int Math, Science, English;
        int Math1, Science1, English1;
        int sum1, sum2;
        float Percentage1, Percentage2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mark of A:");
        System.out.println("Enter mark obtained Math:");
        Math = scan.nextInt();
        System.out.println("Enter mark obtained Science:");
        Science = scan.nextInt();
        System.out.println("Enter mark obtained English:");
        English= scan.nextInt();
        System.out.println();
        System.out.println("Mark of B:");
        System.out.println("Enter mark obtained Math:");
        Math1 = scan.nextInt();
        System.out.println("Enter mark obtained Science:");
        Science1 = scan.nextInt();
        System.out.println("Enter mark obtained English:");
        English1= scan.nextInt();
        sum1 = Math + Science + English;
        sum2 = Math1 + Science1 + English1;
        Percentage1 = (Math + Science + English)/3;
        Percentage2 = (Math1 + Science1 + English1)/3;
        System.out.println();
        System.out.println("Total mark scored by A= "+ sum1 );
        System.out.println("Percentage:"+ Percentage1 +"%");
        System.out.println();
        System.out.println("Total mark scored by B:"+ sum2 );
        System.out.println("Percentage:"+ Percentage2 + "%");

       if(Percentage1 > 75){
           System.out.println("Scholarship Amount for A = 20000");
        }
        else {
           if ((Percentage1 > 60)&&((Percentage2==75)||(Percentage1 < 75))) {
               System.out.println("Scholarship Amount for A = 10000");
           }
           else {
               System.out.println("0$");
           }
       }
        if(Percentage2 >75 ){
            System.out.println("Scholarship Amount for B = 20000");
        }
        else {
            if ((Percentage2 > 60)&&((Percentage2==75)||(Percentage2 < 75))){
                System.out.println("Scholarship Amount for B = 10000");
                }
            else {
                    System.out.println("0$");
                }
            }
        if(Percentage1>Percentage1){
            System.out.println("Is A's Percentage greater than B");
            }
        else{
            if(Percentage1<Percentage2){
                System.out.println("Is A's Percentage lesser than B");
            }
            else{
                if(Percentage1==Percentage2){
                    System.out.println("A and B Percentage equal");
                }
                else {

                }
            }
            }
        }
    }