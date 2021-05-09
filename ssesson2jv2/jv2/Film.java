package ssesson2.jv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Film {
    public static void main(String[] args) {
        int i=0;
        List<String> film = new ArrayList<>();
        film.add( "Doraemon" );
        film.add( "Shin" );
        film.add( "Transfomer" );
        film.add( "Pacific Rim" );
        Scanner scan = new Scanner( System.in );

        do {
            System.out.println("Xin moi ban chon cac tinh nang");
            System.out.println("--------------------------------------");
            System.out.println("1.Them phim moi");
            System.out.println("2.Chinh sua ten phim da co");
            System.out.println("3.Xoa di mot bo phim khoi danh sach ");
            System.out.println("4.In ra danh sach bo phim yeu thich");
            System.out.println("5.Tim kiem ten phim trong danh sach");
            System.out.println("6.Ket thuc chuong trinh");
            System.out.println("----------------------------------------\n");
            i = Integer.parseInt( scan.nextLine() );
            switch (i){
                case 1:
                    System.out.println("Xin moi nhap ten phim");
                    String f = scan.nextLine();
                    film.add( f );
                    System.out.println("Phim"+f+"them vao vi tri:"+(film.indexOf( f )+1));
                    System.out.println(film);
                    break;
                case 2:
                    System.out.println("Chon vi tri muon sua");
                 int v = Integer.parseInt( scan.nextLine() );
//                    int v = scan.nextInt();
                    System.out.println("Nhap ten phim moi");
                    String m =scan.nextLine();
                    film.set( v,m );
                    System.out.println("Sua doi thanh cong");
                    System.out.println(+v+"."+film.get( v ));
                    break;
                case 3:
                    System.out.println("Nhap vi tri muon xoa");
                    int x = Integer.parseInt( scan.nextLine() );
                    film.remove( x );
                    System.out.println("Xoa thanh cong");
                case 4:
                    for (int y=0; y<film.size();y++){
                        System.out.println(y+"."+film.get( y ));
                    }
                case 5:
                    System.out.println("ten phim muon nhap");
                    String t = scan.nextLine();
                    System.out.println("Phim"+t+"co vi tri :"+film.indexOf( t ));
                }
        }while (i<=5);
    }
}
