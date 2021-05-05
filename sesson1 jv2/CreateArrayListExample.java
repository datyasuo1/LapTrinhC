package sesson1;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add( "Lion" );
        animal.add( "Tiger" );
        animal.add( "Cat" );
        animal.add("Dog");
        System.out.println(animal);
        animal.add( "Elephant" );
        System.out.println(animal);
    }
}
