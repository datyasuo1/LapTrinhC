package sesson8;

public class TestTriangle {
    public static void main(String[] args) {
        Point p1 = new Point(5,3);
        Point p2 = new Point(2,4);
        Point p3 = new Point(4,4);
        Triangle Test = new Triangle(p1,p2,p3);
        if(((Test.getAB()+Test.getBC())>Test.getAC())&&((Test.getAB()+Test.getAC())>Test.getBC())&&((Test.getAC()+Test.getBC())>Test.getAB())){
            System.out.println("A"+p1);
            System.out.println("B"+p2);
            System.out.println("c"+p3);
            System.out.println("Perimeter: "+Test.getPerimeter());
            System.out.println("ABC la 1 tam giac");
        }else {

            System.out.println("ABC khong la1 tam giac.Hay thu lai");
        }
    }
}
