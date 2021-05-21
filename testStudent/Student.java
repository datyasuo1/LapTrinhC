package testStudent;


public class Student {
    private String studentID;
    private String name;
    private String address;
    private String phoneNumber;

    public Student(String studentID, String name, String address, String phoneNumber) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public  static Student createStudent(String studentID,String name,String address,String phoneNumber){
        return new Student(studentID,name,address,phoneNumber);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
