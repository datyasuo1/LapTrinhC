package DemoAbstract;

public class TestShape {
    public static void main(String[] args) {
        Rectangle r1 =new  Rectangle("red", 12,10);
        System.out.println(r1.toString());
        Triangle r2 = new Triangle( "Blue", 2, 20 );
        System.out.println(r2.toString());
    }
}
