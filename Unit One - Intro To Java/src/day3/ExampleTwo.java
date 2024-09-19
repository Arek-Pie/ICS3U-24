package day3;

public class ExampleTwo 
{
    public static void main(String[] args) 
    {
        double x = 7;
        System.out.println(x);
        double a = (double)4 / 3;
        System.out.println(a);
        a = (double)(4 / 3);
        System.out.println(a);

        //int f = 8.9     (doesn't work)
        int f = (int) 8.9;
    }
}
