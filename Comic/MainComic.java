package ssesson2.jv2;

import java.util.Scanner;

public class MainComic {
    private static Scanner scanner = new Scanner( System.in );
    private static ComicList comicList = new ComicList( "One piece" );

    public static void main(String[] args) {
        boolean quit=false;
        startLibrary();
        printLibrary();
        while (!quit){
            System.out.println("Xin mời chọn các chức năng trong thư viện");
            int chose = Integer.parseInt( scanner.nextLine() );
            scanner.nextLine();
            switch (chose){
                case 0:
                    System.out.println("Thoát ra khỏi thư viện online");
                    quit=true;
                    break;
                case 1:
                    comicList.printComic();
                    break;
                case 2:
                    addComic();
                    break;
                case 3:
                    updateComic();
                    break;
                case 4:
                    removeComic();
                    break;
                case 5:
                    queryComic();
                case 6:
                    printLibrary();
                    break;

            }
        }
    }
    public static void addComic(){
        System.out.println("Xin mời nhập tên truyện muốn thêm vào");
        String comic = scanner.nextLine();
        System.out.println("Nhập tên tác giả cuả truyện");
        String name = scanner.nextLine();
        Comic newComic = Comic.createComic( comic,name );
        if (comicList.addComic( newComic )){
            System.out.println("Truyện mới :"+comic+",Tác giả:"+name);
        }
        else {
            System.out.println("Không thể thêm truyện:"+comic+",truyện đã có trong thư viện");
        }
    }
    private static void updateComic(){
        System.out.println("Nhập tên truyện mà bạn muốn cập nhật");
        String comic = scanner.nextLine();
        System.out.println("Nhập tên tác giả của truyện");
        String name = scanner.nextLine();
        Comic existingComic = comicList.queryComic( name );
        if (existingComic == null){
            System.out.println("Truyện không tồn tại");
            return;
        }
        System.out.println("Nhập tên phim mới cần update");
        String newComic = scanner.nextLine();
        System.out.println("Nhập tên tác giả của truyện");
        String newName = scanner.nextLine();
        Comic newComics = Comic.createComic( newComic,newName );
        if (comicList.updateComic( existingComic,newComics )){
            System.out.println("Cập nhật thành công");
        }else {
            System.out.println("Cập nhật ko thành công");
        }
    }
    private static void removeComic(){
        System.out.println("Nhập tên truyện muốn xóa");
        String comic = scanner.nextLine();
        System.out.println("Nhập tên tác giả");
        String name = scanner.nextLine();
        Comic existingComic = comicList.queryComic( name);
        if (existingComic ==null){
            System.out.println("Truyện ko tồn tại");
            return;
        }
        if (comicList.removeComic( existingComic )){
            System.out.println("Truyện đã xóa thành công");
        }else {
            System.out.println("Lỗi khi xóa");
        }
    }
    private static void queryComic(){
        System.out.println("Nhập tên truyện ");
        String comic = scanner.nextLine();
        System.out.println("Nhập tên tác giả");
        String name = scanner.nextLine();
        Comic existingComic = comicList.queryComic( name);
        if (existingComic == null){
            System.out.println("Truyện không có trong thư viện");
            return;
        }
        System.out.println("Truyện:"+existingComic.getComic()+",tác giả"+existingComic.getAuthor());
    }
    private static void startLibrary(){
        System.out.println("Chào mừng tới với thư viện truyện");
    }
    private static void printLibrary(){
        System.out.println("\n Available action\npress");
        System.out.println("o-Tắt thư viện\n"
                +"1-In ra danh sách\n"
                +"2-Thêm vào danh sách\n"
                +"3-Cập nhật danh sách"
                +"4-Xóa truyện khỏi danh sách\n"
                +"5-Kiểm tra truyện"
                +"6-In danh sách các hành động có sẵn \n");
        System.out.println("Chose your action");
    }
}
