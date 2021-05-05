package sesson1;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {
    public static void main(String[] args) {
        List<String> tvShows = new java.util.ArrayList<>();
        tvShows.add( "breaking bad" );
        tvShows.add( "Game of thornes" );
        tvShows.add( "Friend" );
        tvShows.add( "tom and jerry" );

        System.out.println("Iterate using jv 8 for each and lambda");
        tvShows.forEach( tv ->{
            System.out.println(tv);
        } );
        System.out.println("iterator");
        Iterator<String> tvShow = tvShows.iterator();
        while (tvShow.hasNext()){
            String tv = tvShow.next();
            System.out.println(tv);
        }

        System.out.println("ListIterator");
        ListIterator<String> tvShowList = tvShows.listIterator(tvShows.size());
        while (tvShowList.hasPrevious()){
            String tv = tvShowList.previous();
            System.out.println(tv);
        }
        System.out.println("\n=== Iterate using for loop with index ===");
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));

        }

    }
}
