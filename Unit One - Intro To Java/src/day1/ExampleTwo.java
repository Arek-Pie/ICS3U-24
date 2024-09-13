package day1;

public class ExampleTwo 
{
    public static void main(String[] args) 
    {
        String str = "This is a string.";
        System.out.println(str);

        int numStudents = 14;
        System.out.println(numStudents);

        double temperature = 21.7;
        System.out.println(temperature);

        boolean hasSome = true;
        System.out.println(hasSome);

        int a = 9, b = 8, c;
        c = a + b;
        if (c >= a)
        {
            a = 15;
            System.out.println(c + a + b);
        }

        final double PI = 3.14; //final states a constant
        System.out.println(PI);
    }
}
