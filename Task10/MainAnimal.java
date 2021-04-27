package Task10;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        Bird bird = new Bird("Eagle" );
        bird.fly();
        Fish fish = new Fish( "Shark" );
        fish.swim();
        fish.dive();
        Tiger tiger = new Tiger( "Tiger Wild" );
        tiger.speed( 35 );
        System.out.println("Enter the weight of the feed ");
        int mass = scan.nextInt();
        Food f1 = new Food(mass);
        Animal animal = new Animal( f1 );
        System.out.println("The amount of food for one time is ");
        int m = scan.nextInt();
        animal.eat(f1,m );
        animal.HaveBaby( animal.getName() );

    }
}
