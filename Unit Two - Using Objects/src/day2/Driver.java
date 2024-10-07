package day2;

public class Driver 
{
    public static void main(String[] args) 
    {
        Student student1;
        Student student2 = new Student("Steam", 100, "68746587354", 90, "CS", 24, true);
        Student student3 = new Student("Jeb", 111, "+87467474568413", 10, "CS", 24, true);
        
        student1 = student3;
        student2.study(5);

        System.out.println(student1);
        System.out.println(student2);
    }
}
