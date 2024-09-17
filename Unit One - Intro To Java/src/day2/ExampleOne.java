package day2;

public class ExampleOne 
{
    public static void main(String[] args) 
    {
        final int num = 6591;
        int digit4 = num % 10;
        int digit1 = num / 1000;
        int digit3 = num / 10 % 10;
        int digit2 = num / 100 % 10;

        int sum = digit1 + digit2 + digit3 + digit4;
        System.out.println(sum);
    }
}
