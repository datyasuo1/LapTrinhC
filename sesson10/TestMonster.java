package sesson10;

public class TestMonster {
    public static void main(String[] args) {
        FireMonster m1 = new  FireMonster("GaoRed");
        System.out.println(m1.attack());
        WaterMonster m2 = new WaterMonster("GaoBlue");
        System.out.println(m2.attack());
        StoneMonster m3 = new StoneMonster( "GaoSliver");
        System.out.println(m3.attack());
        m3 = new StoneMonster("GaoBlack");
        System.out.println(m3.attack());
        Monster m4 = new Monster("GaoGod");
        System.out.println(m4.attack());
    }
}
