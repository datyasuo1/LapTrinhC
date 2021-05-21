package testStudent;


import java.util.Scanner;

public class MainStudent {
    private static Scanner scanner = new Scanner( System.in );
    private static StudentList studentList = new StudentList( "1" );

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit){
            System.out.println("\nEnter action:(6 to show available action");
            int action = Integer.parseInt( scanner.nextLine() );
            scanner.nextLine();
            switch (action){
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentList.displayStudentList();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Byeeee");
                    quit = true;
                    break;

            }
        }
    }
    public static void addStudent(){
        System.out.println("Enter new student name:");
        String Name = scanner.nextLine();
        System.out.println("Enter ID student");
        int ID = Integer.parseInt( scanner.nextLine() );
        System.out.println("Enter address");
        String Add = scanner.nextLine();
        System.out.println("Enter phone number");
        int Phone = Integer.parseInt( scanner.nextLine() );
        Student newStudent = Student.createStudent( ID,Name,Add,Phone );
        if (studentList.addNewStudent(newStudent)){
            System.out.println("New contract adder:name="+Name+"");
        }else {
            System.out.println("Cannot add,"+Name+"already on file");
        }
    }
}
