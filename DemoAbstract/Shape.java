package DemoAbstract;

abstract public class Shape {
    private  String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
    abstract public double getArea();
}
