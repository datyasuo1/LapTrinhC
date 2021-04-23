package DemoAbstract;
public class Rectangle extends Shape {
    private double length;
    private double with;

    public Rectangle(String color, double length, double with) {
        super( color );
        this.length = length;
        this.with = with;
    }

    @Override
     public double getArea(){
        return with*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", with=" + with +
                '}'+"Area"+getArea();
    }
}
