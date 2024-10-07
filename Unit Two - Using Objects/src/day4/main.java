package day4;

import day2.Student;

public class Main 
{
    public static void main(String[] args) 
    {
        //Q1
        Teacher teacher1 = new Teacher("Mr. Smith", "Math", 10);

        //Q2
        Student student1 = new Student("John", 85, 95.0);
        Student student2 = new Student("Jane", 90, 98.0);

        //Q3
        Course mathCourse = new Course("Algebra", teacher1);

        //Q4
        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        //Q5
        mathCourse.startClass();

        //Q6
        teacher1.assignGrade(student1, 85);
        teacher1.assignGrade(student2, 90);

        //Q7
        student1.attendClass();
        student2.attendClass();

        //Q8
        mathCourse.printCourseRoster(student1);
        mathCourse.printCourseRoster(student2);

        // Q9
        if(student1.graduate())
        {
            System.out.println("John Can Graduate");
        }
        else
        {
            System.out.println("John Can't Graduate");
        }

        if(student2.graduate())
        {
            System.out.println("Jane Can Graduate");
        }
        else
        {
            System.out.println("Jane Can't Graduate");
        }
    }
}
