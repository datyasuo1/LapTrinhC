package Task10;

public class Bird extends Animal{
    public Bird(String name) {
        super( name );
    }
    public void fly(){
        System.out.println(""+super.getName()+":flies very high");
    }
    @Override
    public void HaveBaby(String name){
        super.HaveBaby( name );
    }
    @Override
    public String toString() {
        return "Name of your new Bird is:" + super.getName();
    }
}
