package Task9;

public class Employee {
    String ID;
    String Name;
    int salary;
    float commission;

    public Employee(String ID, String name, int salary) {
        this.ID = ID;
        Name = name;
        this.salary = salary;

    }
    public void calcCommission(float sales){
        if (sales >10000)
            commission = salary*20/100;
        else
            commission=0;
    }
    public void calcCommission(int overtime){
        if (overtime >8)
            commission=salary/30;
        else
            commission=0;
    }
    public void displayDetails(){
        System.out.println("Employee ID:"+ID);
        System.out.println("Employee Name:"+Name);
        System.out.println("Salary:"+salary);
        System.out.println("Commission:"+commission);
    }
}
