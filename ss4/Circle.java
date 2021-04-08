package sesson4;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r,String c){
        radius = r;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public void setColor(String newColor){
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("Radius is:"+ c4.getRadius());
        c4.setColor("red");
        System.out.println("color is:");
    }
}
