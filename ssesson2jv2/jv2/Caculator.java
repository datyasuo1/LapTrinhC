package ssesson2.jv2;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
      double sum=0;
      int so[]= new int[5];
        System.out.println("Nhap 5 so:");
      for (int i=0;i<5;i++) {
          Scanner a = new Scanner( System.in );
          so[i]=a.nextInt();
      }
      for(int i=0;i<5;i++){
          System.out.println("Element"+(i+1)+", type value was"+so[i]);
          sum+=so[i];
      }
        System.out.println("Average is :");
        System.out.println(sum/5);
    }
}