package DemoAbstract;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super( color );
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea(){
        return (height/2)*base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}'+"Area"+getArea();
    }
}
