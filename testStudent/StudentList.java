package testStudent;


import java.util.ArrayList;

public class StudentList {
    private String myStudent;
    private ArrayList<Student> StudentList;

    public StudentList(String myStudent) {
        this.myStudent= myStudent;
       this. StudentList = new ArrayList<Student>();
    }
    private int findContact(String studentName){
        for(int i=0; i<this.StudentList.size();i++){
            Student student = this.StudentList.get( i );
            if(student.getStudentName().equals( studentName )){
                return i;
            }
        }
        return -1;
    }
    public  boolean addNewStudent(Student student) {
        if (findContact(student.getStudentName()) >= 0) {
            System.out.println("Student is already in file");
            return false;
        }else {
            StudentList.add( student );
            return true;
        }
    }
    public void displayStudentList(){
        System.out.println("StudentList"+StudentList);
        for (int i =0;i<this.StudentList.size();i++){
            System.out.println((i+1)+"."+
                    this.StudentList.get( i ).getStudentID()+","+
                    this.StudentList.get( i ).getStudentName()+","+
                    this.StudentList.get( i ).getAddress()+","+
                    this.StudentList.get( i ).getPhone()+",");
        }
    }
}

