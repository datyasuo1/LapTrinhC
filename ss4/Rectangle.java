package sesson4;

public class Rectangle {
    int width;
    int height;
    Rectangle(){
        System.out.println("Constructor Invoked...");
        width=10;
        height=10;
    }
    Rectangle(int wid, int heig){
        System.out.println("Parameterized Constructor");
        width=wid;
        height=heig;
    }
    void displayDimensions(){
        System.out.println("With:" + width);
        System.out.println("Height"+ height);
    }
}
