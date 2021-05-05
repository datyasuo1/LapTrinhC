package sesson1;
import java.util.List;
import java.util.ArrayList;
public class SearchElementInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add( "John" );
        names.add( "Alice" );
        names.add( "Bob" );
        names.add( "Steve" );
        names.add( "John" );
        names.add( "Steve" );
        names.add( "Maria" );

        System.out.println( "Does names array contain \"Bob\"? : " + names.contains( "Bob" ) );
        System.out.println( "indexOf \"Steve\": " + names.indexOf( "Steve" ) );
        System.out.println( "indexOf \"Mark\": " + names.indexOf( "Hark" ) );
        System.out.println( "lastIndexOf \"John\" : " + names.lastIndexOf( "John" ) );
        System.out.println( "lastIndexOf \"Bill\" : " + names.lastIndexOf( "Bill" ) );
    }
}
