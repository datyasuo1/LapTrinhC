package sesson1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add( "Dat" );
        students.add( "Hoang Anh" );
        students.add( "Duong" );
        students.add( "Viet" );
        students.add( "Dat" );
        System.out.println(students);
        List<String> AllStudent = new ArrayList<>(students);

        List<String> nextStudent = new ArrayList<>();
        nextStudent.add( "Jorn" );
        nextStudent.add( "Marc" );

        AllStudent.addAll( nextStudent );
        System.out.println(AllStudent);

        AllStudent.remove( 5 );
        System.out.println("after remove"+AllStudent);

        AllStudent.set( 5,"Hoai" );
        System.out.println("after set"+AllStudent);
        System.out.println("hs thu tu ");
        Iterator<String> student = AllStudent.iterator();
        while (student.hasNext()){
            String sv = student.next();
            System.out.println(sv);
        }
    }
}
