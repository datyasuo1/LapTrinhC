package Task10;

public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);
    }

    public void speed(int speed){
        System.out.println(""+ super.getName()
                +": Have speed: "+speed + "km\\h");
    }

    @Override
    public void HaveBaby(String name) {
        super.HaveBaby(name);
    }

    @Override
    public String toString() {
        return "Name of your new tiger is:" + super.getName();
    }
}
