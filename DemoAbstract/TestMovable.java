package DemoAbstract;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint( 1,2 );
        System.out.println(p1);
        System.out.println(p1);
        System.out.println(p1);

        Movable p2 = new MovablePoint( 3,4 );
        p2.moveUp();
        MovablePoint p3 =  (MovablePoint)p2;
        System.out.println(p3);
    }
}
