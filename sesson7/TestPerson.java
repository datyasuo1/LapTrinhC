package sesson7;

public class TestPerson {
    public static void main(String[]args){
        Student s1 = new Student("tan ah teck", "1 happy ave");
        s1.addCourseGrade("IM101",97);
        s1.addCourseGrade("IM102",68);
        s1.printGrades();
        System.out.println("average is" + s1.getAverageGrade());
        Teacher t1 = new Teacher("paul tan","8");
        System.out.println(t1);
        String[] course = {"IM101","IM102","IM101"};
        for(String courses:course){
            if(t1.addCourse(courses)){
                System.out.println(course +"added");
            }else{
                System.out.println(course+"cannot be added");
                 }
            }
        for(String courses : course){
            if(t1.removeCourse(courses)){
                System.out.println(course + "removed");
            }else{
                System.out.println(course +"cannot be removed" );
            }
        }
        }
}
