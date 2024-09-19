package day2;

public class ExampleTwo 
{
    public static void main(String[] args) 
    {
        int x = 7, y = 8;
        double a = 2.6, b = 0.5;

        x = x + 7;
        y += 3;
        b -= 6;
        a *= 3;
        x /= 4;
        y %= 3;
        x ++;
        ++ x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
