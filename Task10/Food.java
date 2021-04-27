package Task10;

public class Food {
    private int mass;

    public Food(int mass) {
        this.mass = mass;
    }

    public Food() {

    }

    public int getMass() {
        return mass;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }
    public void conlai(int m){
        this.mass=mass-m;
    }
    public String toString(){
        return "Thuc an con lai la:"+mass+"kg";
    }
}
