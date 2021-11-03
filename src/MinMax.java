import java.util.Scanner;

public class MinMax {
    public static void main(String args[]) {
        int  large=0, small=0;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the number1 :");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number2 :");
        int num2 = scanner.nextInt();
        System.out.print("Enter the number3 :");
        int num3 = scanner.nextInt();


        large= Math.max(num1,Math.max(num2,num3));
        System.out.println("The maximum number is " + large);
        small=Math.min(num1,Math.min(num2,num3));
        System.out.println("The minimum number is " + small);
    }
}
