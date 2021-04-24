package Task9;

public class PartTime extends Employee{
    String shift;

    public PartTime(String ID, String name, int salary, String shift) {
        super( ID, name, salary );
        this.shift = shift;
    }
    public void displayDetails(){
        calcCommission( 12 );
        super.displayDetails();
        System.out.println("Working shift:"+shift);
    }
}
