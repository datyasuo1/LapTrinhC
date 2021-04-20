package sesson8;

public class Triangle {
    private Point a, b, c;
    private double  perimeter,BC,AC,AB;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }
    public double getBC() {
        return this.BC = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
    }

    public double getAC() {
        return this.AC = Math.sqrt((c.getX()-a.getX())*(c.getX()-a.getX())+(c.getY()-a.getY())*(c.getY()-a.getY()));
    }
    public double getAB() {
        return this.AB = Math.sqrt((b.getX()-a.getX())*(b.getX()-a.getX())+(b.getY()-a.getY())*(b.getY()-a.getY()));
    }
    public double getPerimeter() {
        return this.perimeter = AB+AC+BC;
    }
}