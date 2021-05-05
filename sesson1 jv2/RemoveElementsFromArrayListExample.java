package sesson1;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programingLanguages = new ArrayList<>();
        programingLanguages.add( "C" );
        programingLanguages.add( "C++" );
        programingLanguages.add( "Java" );
        programingLanguages.add( "Kotlin" );
        programingLanguages.add( "Python" );
        programingLanguages.add( "Perl" );
        programingLanguages.add( "Ruby" );
        System.out.println("Initial list:"+programingLanguages);

        programingLanguages.remove( 5 );
        System.out.println("After remove(5):"+programingLanguages);

        boolean isRemoved = programingLanguages.remove( "Kotlin" );
        System.out.println("After remove(\"Kotkin\"):"+programingLanguages);
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add( "Python" );
        scriptingLanguages.add( "Ruby" );
        scriptingLanguages.add( "Perl" );

        programingLanguages.removeAll( scriptingLanguages );
        System.out.println("After removeAll(scriptingLanguages):"+programingLanguages);

        programingLanguages.removeIf( n ->(n.charAt( 0 )=='T') );
        System.out.println("After removing aa element that start with\"C\":"+programingLanguages);
        programingLanguages.clear();
        System.out.println("After Clear():"+programingLanguages);
    }
}
