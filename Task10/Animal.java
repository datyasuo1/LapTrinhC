package Task10;

import java.util.Scanner;

public class Animal extends Food{
    private String name;
    private Food food;

    public Animal(String name) {
        this.name = name;
        System.out.println("Ten con vat moi la:" + name);
    }

    public Animal(Food food) {
        this.food = food;
    }
    public Animal(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }
    protected void eat(Food food,int m){
        food.conlai(m);
        System.out.println("Thuc an da su dung"+m+"kg");
        System.out.println(getFood());
    }
    public void HaveBaby(String name){
        Scanner scan = new Scanner( System.in );
        System.out.println("Nhap ten con vat sinh ra");
        name = scan.nextLine();
        Animal baby = new Animal( name );
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
