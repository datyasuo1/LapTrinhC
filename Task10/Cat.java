package Task10;

public class Cat extends Animal{
    private int speed;
    private Rat food;

    public Cat(String name, int speed) {
        super( name );
        this.speed = speed;
    }
    public Cat(Rat food){
        this.food = food;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void eat(Rat food){
        if (food.getWeight()>=100){
            System.out.println("Easy Game chuot beo qua");
        }else {
            System.out.println("Easy Game chuot gay qua");
        }
    }
    public void run(){
        System.out.println("Chay dau cho het nang");
    }
}
