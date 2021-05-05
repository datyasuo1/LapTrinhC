package sesson1;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add( 2 );
        firstFivePrimeNumbers.add( 3 );
        firstFivePrimeNumbers.add( 5 );
        firstFivePrimeNumbers.add( 7 );
        firstFivePrimeNumbers.add( 11 );

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumber = new ArrayList<>();
        nextFivePrimeNumber.add( 13 );
        nextFivePrimeNumber.add( 17 );
        nextFivePrimeNumber.add( 19 );
        nextFivePrimeNumber.add( 23 );
        nextFivePrimeNumber.add( 29 );

        firstTenPrimeNumbers.addAll( nextFivePrimeNumber );
        System.out.println(firstTenPrimeNumbers);
    }
}
