import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = scanner.nextInt();
        int i,  sum = 0;

        for(i = 1; i <= num; ++i)
        {

            sum = sum + i;
        }

        System.out.println("Sum of Numbers is = " + sum);
    }
}
