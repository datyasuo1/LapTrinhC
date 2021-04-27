package Task10;

public class Fish extends Animal{
    public Fish(String name) {
        super( name );
    }

    public void swim(){
        System.out.println("Fish:"+ super.getName()+" swims very far");
    }
    public void dive(){
        System.out.println(""+ super.getName()+"is very deep diving ");
    }
    @Override
    public void HaveBaby(String name) {
        super.HaveBaby(name);
    }


    @Override
    public String toString() {
        return "Name of your new fish is:" + super.getName();
    }
}
