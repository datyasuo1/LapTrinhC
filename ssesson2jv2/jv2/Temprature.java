package ssesson2.jv2;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
    double sum=0;
    int j=0;
        System.out.print("How many day's temperatures? ");
        Scanner scan = new Scanner( System.in );
    int n=scan.nextInt();
    int nhietdo[]=new int[n];

        for (int i=0;i<n;i++){
        System.out.print("Day "+(i+1)+"'s high temp: ");
        Scanner y=new Scanner(System.in);
        nhietdo[i]=y.nextInt();
    }
        for (int i=0;i<n;i++){
        sum+=nhietdo[i];
    }
        System.out.println("Average = "+sum/n);
        for (int i=0;i<n;i++){
        if(nhietdo[i]>(sum/n)){
            j=j+1;
        }
    }
        System.out.printf("%d days above average",j);
}
}
