package sesson10;

public class StoneMonster extends Monster{
    public StoneMonster(String name) {
        super( name );
    }
    @Override
    public String attack(){
        return "Attack with stone"+" "+getName();
    }
}
