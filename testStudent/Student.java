package testStudent;

import ssesson2.jv2.Contact;

public class Student {
    private int studentID;
    private String studentName;
    private String address;
    private int phone;

    public Student(int studentID, String studentName, String address, int phone) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
    }
    public static Student createStudent(int studentID,String studentName,String address,int phone){
        return new Student( studentID,studentName,address,phone);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
