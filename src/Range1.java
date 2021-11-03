import java.util.Scanner;

public class Range1 {
    public static void main(String args[]) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number1 :");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number2 :");
        int num2 = scanner.nextInt();
        System.out.println("\nThe numbers between "+ num1+ " and "+ num2 + " is: ");
        for (int i=num1;i<=num2;i++)
        {

            System.out.println(i);
        }

    }
}
