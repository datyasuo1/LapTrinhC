package Task9;

public class Retangle extends Shape{
    float perimeter;
    float length=10;
    @Override
    public void calculate(float with){
        perimeter = 2*(length+with);
        System.out.println("Perimeter of the the rectangle is:"+perimeter);
    }
}
