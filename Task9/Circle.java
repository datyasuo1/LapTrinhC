package Task9;

public class Circle extends Shape{
    float area;
    @Override
    public void calculate(float rad){
        area=getPI()*rad*rad;
        System.out.println("Area of circle is :"+area);
    }
}
