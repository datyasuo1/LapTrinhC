package ssesson2.jv2;

import java.util.ArrayList;

public class ComicList {
    private String myComic;
    private ArrayList<Comic> theComic;

    public ComicList(String myComic) {
       myComic = myComic;
        this.theComic = new ArrayList<Comic>();
    }
    public int findComic(Comic comic){
        return this.theComic.indexOf( comic );
    }
    public int findComic(String comicName){
        for (int i=0;i<this.theComic.size();i++){
            Comic comic =this.theComic.get( i );
            if (comic.getComic().equals( comicName )){
                return i;
            }
        }
        return  -1;
    }
    public String queryComic(Comic comic){
      if (findComic( comic )>=0){
          return comic.getComic();
      }
        return null;
    }
    public Comic queryComic (String name){
        int position = findComic( name );
        if (position>=0){
            return this.theComic.get( position );
        }
        return null;
    }
    public boolean addComic(Comic comic){
        if (findComic( comic.getComic() )>=0){
            System.out.println("Truyện đã có trong danh sách");
            return false;
        }
        this.theComic.add( comic );
        return true;
    }
    public boolean updateComic(Comic oldComic, Comic newComic){
        int foundPosition = findComic( oldComic );
        if (foundPosition<0){
            System.out.println(oldComic.getComic()+" có ở trong danh sách");
            return false;
        }
        this.theComic.set( foundPosition,newComic );
        System.out.println(oldComic.getComic()+"đã được thay bằng"+newComic.getComic());
        return true;
    }
    public boolean removeComic(Comic comic){
        int foundPosition = findComic( comic );
        if (foundPosition<0){
            System.out.println(comic.getComic()+"không tồn tại trong danh sách");
            return false;
        }
        this.theComic.remove( foundPosition );
        System.out.println(comic.getComic()+"đã được xóa");
        return true;
    }
    public void printComic(){
        System.out.println("Danh sách truyện của tôi"+myComic);
        for (int i=0;i<this.theComic.size();i++){
            System.out.println((i+1)+"."
            +this.theComic.get( i ).getComic()
            +this.theComic.get( i ).getAuthor());
        }
    }
}
