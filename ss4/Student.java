package sesson4;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Student {
        String studName;
        int studAge;
        void initialize(){
            studName = "Jams Anderson";
            studAge = 26;
        }
        void input(){
            System.out.println("Enter Name Student");
            Scanner scan = new Scanner(System.in);
            studName = scan.next();
            System.out.println("Enter Age Student");
            studAge = scan.nextInt();
        }
        void display(){
            System.out.println("Student Name:" +studName);
            System.out.println("Student Age :" +studAge);
        }
        public static void main(String[]args){
            int chose;
            Student objectStudent = new Student();
            objectStudent.initialize();
            objectStudent.display();
            System.out.println();
//            Student objectStudent1 = new Student();
//            objectStudent1.input();
//            objectStudent1.display();
            do{
                Student objectStudent1 = new Student();
                objectStudent1.input();
                objectStudent1.display();
                System.out.println("ban co muon tiep tuc khong \n1 de tiep tuc\n0 de ket thuc");
                Scanner scan = new Scanner(System.in);
                chose = scan.nextInt();
            }while (chose != 0);
            System.out.println("ket thuc");
    }
}
