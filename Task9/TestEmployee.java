package Task9;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee( "E01","ABC",4000 );
        e1.calcCommission( 20000F );
//        e1.calcCommission( 20000 );
        e1.displayDetails();
    }
}
