package sesson10;

public class FireMonster extends Monster{
    public FireMonster(String name) {
        super( name );
    }
    @Override
    public String attack(){
        return "Attack with fire"+getName();
        }
}
