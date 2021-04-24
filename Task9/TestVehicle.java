package Task9;

public class TestVehicle {
    public static void main(String[] args) {
        FourWheeler f1 = new FourWheeler( "LA-09","Volkswagen",4,true );
        f1.showDetail();
        f1.accelerate( 200 );
    }
}
