package Task9;

public class TestAllEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee( "E01","ABC",40000 );
        e1.calcCommission( 20000F );
        e1.displayDetails();
        System.out.println("------------------------------------------------");
        Employee e2 = new PartTime( "E02","BCD",30000,"Day" );
        e2.displayDetails();
    }
}
